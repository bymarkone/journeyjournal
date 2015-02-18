package com.thoughtworks.jj.twdsl.rest;

import com.thoughtworks.jj.twdsl.TwDslApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TwDslApplication.class)
@WebAppConfiguration
@ActiveProfiles("test")
public class TextTwDslCompilerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void init() {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void createsAnArea() throws Exception {
        String script = "create Area Programming Languages with level Intermediate.";
        mockMvc.perform(post("/api/twdsl/editor").content(script))
                .andExpect(status().isOk());

        mockMvc.perform(get("/api/jj/area"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name", is("Programming Languages")));
    }

    @Test
    public void createACapability() throws Exception {
        String text = "create Capability Influencer with mission 'Leverage the community to excellence'.";

        mockMvc.perform(post("/api/twdsl/editor").content(text))
                .andExpect(status().isOk());

        mockMvc.perform(get("/api/jj/capability"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name", is("Influencer")))
                .andExpect(jsonPath("$[0].mission", is("Leverage the community to excellence")));
    }

    @Test
    public void createCapabilityWithHighLevelGoals() throws Exception {
        String text = "create Capability Influencer with mission 'Leverage the community to excellence'.\n" +
                        "add Goal 'Talk about the state of art in Java related technologies'.\n" +
                        "add Goal 'Talk about technical consequences of Agile and key differences between methodologies and mindset'.\n";

        mockMvc.perform(post("/api/twdsl/editor").content(text))
                .andExpect(status().isOk());

        mockMvc.perform(get("/api/jj/capability"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name", is("Influencer")))
                .andExpect(jsonPath("$[0].mission", is("Leverage the community to excellence")))
                .andExpect(jsonPath("$[0].goals[0].description", is("Talk about the state of art in Java related technologies")))
                .andExpect(jsonPath("$[0].goals[1].description", is("Talk about technical consequences of Agile " +
                                                                        "and key differences between methodologies and mindset")));
    }

    @Test
    public void createCapabilityWithHighLevelGoalAndHowToGetThere() throws Exception {
        String text =
                "create Capability Influencer with mission 'Leverage the community to excellence'.\n" +
                "add Goal 'Talk about the state of art in Java related technologies'.\n" +
                "add Action Item 'Prepare a talk about MicroServices'.\n" +
                "add Goal 'Talk about technical consequences of Agile and key differences between methodologies and mindset'.\n"
                ;

        mockMvc.perform(post("/api/twdsl/editor").content(text))
                .andExpect(status().isOk());

        mockMvc.perform(get("/api/jj/capability"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name", is("Influencer")))
                .andExpect(jsonPath("$[0].mission", is("Leverage the community to excellence")))
                .andExpect(jsonPath("$[0].goals[0].description", is("Talk about the state of art in Java related technologies")))
                .andExpect(jsonPath("$[0].goals[1].description", is("Talk about technical consequences of Agile " +
                        "and key differences between methodologies and mindset")))
                .andExpect(jsonPath("$[0].goals[0].actionItems[0].description", is("Prepare a talk about MicroServices")))
                ;

    }

    @Test
    public void createFeedback() throws Exception {

        String text = "receive Great Feedback from Linda: Good with people\n";

        mockMvc.perform(post("/api/twdsl/editor").content(text))
                .andExpect(status().isOk());

        mockMvc.perform(get("/api/jj/feedback"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].description", is("Good with people")))
                .andExpect(jsonPath("$[0].quality", is("Great")));

    }

    @Test
    public void createFacts() throws  Exception {

        String text = "register Fact 'Did very well developing with speed in AMP' " +
                "for topic 'AMP Project' " +
                "on time '2014 at ThoughtWorks'\n";

        mockMvc.perform(post("/api/twdsl/editor").content(text))
                .andExpect(status().isOk());

        mockMvc.perform(get("/api/jj/fact"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].description", is("Did very well developing with speed in AMP")))
                .andExpect(jsonPath("$[0].group", is("AMP Project")))
                .andExpect(jsonPath("$[0].when", is("2014 at ThoughtWorks")));

    }
}

package com.thoughtworks.jj.jarvis.rest;

import com.thoughtworks.jj.jarvis.JarvisApplication;
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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JarvisApplication.class)
@WebAppConfiguration
@ActiveProfiles("test")
public class TextJarvisCompilerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void init() {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void createsAnCapabilityPhraseInLowLevelLanguage() throws Exception {
        String script = "I want to be an Influencer that leverage the community to excellence.\n";
        mockMvc.perform(post("/api/jarvis/editor").content(script))
                .andExpect(status().isOk())
                .andExpect(content().string("create Capability Influencer with mission 'leverage the community to excellence'\n"));

    }

    @Test
    public void createsGoalsPhrasesInLowLevelLanguage() throws Exception {
        String script = "My high level goals are:\n " +
                "  1. Talk about the state of art in Java related technologies\n" +
                "  2. Talk about technical consequences of Agile and key differences between methodologies and mindset\n";

        mockMvc.perform(post("/api/jarvis/editor").content(script))
                .andExpect(status().isOk())
                .andExpect(content()
                        .string("add Goal 'Talk about the state of art in Java related technologies'\n" +
                                "add Goal 'Talk about technical consequences of Agile and key differences between methodologies and mindset'\n"));
    }

    @Test
    public void generatesHighlightsLowLevelCode() throws Exception {

        String script = "What I would like to highlight on what I did before I join ThoughtWorks is:\n" +
                "  - First coding experience at 7th grade, designing and coding a graphical scaled solar system\n" +
                "  - Most part of professional live first in my family and then my own company. I did all sort of stuff there\n";

        mockMvc.perform(post("/api/jarvis/editor").content(script))
                .andExpect(status().isOk())
                .andExpect(content()
                        .string("register Fact 'First coding experience at 7th grade, designing and coding a graphical scaled solar system' " +
                                    "on time 'before I join ThoughtWorks'\n" +
                                "register Fact 'Most part of professional live first in my family and then my own company. I did all sort of stuff there' " +
                                    "on time 'before I join ThoughtWorks'\n"));

    }

    @Test
    public void generatesHighlightsWithTopicLowLevelCode() throws Exception {

        String script = "What I would like to highlight on what I did in 2014 at ThoughtWorks is:\n" +
                "  On topic: AMP Project\n" +
                "    - Did very well developing with speed in AMP\n" +
                "    - Started helping more other people in the team and speeding people ramp up\n";

        mockMvc.perform(post("/api/jarvis/editor").content(script))
                .andExpect(status().isOk())
                .andExpect(content()
                        .string("register Fact 'Did very well developing with speed in AMP' " +
                                    "for topic 'AMP Project' " +
                                    "on time '2014 at ThoughtWorks'\n" +
                                "register Fact 'Started helping more other people in the team and speeding people ramp up' " +
                                    "for topic 'AMP Project' " +
                                    "on time '2014 at ThoughtWorks'\n"));

    }

    @Test
    public void generatesTasksInLowLevelCode() throws Exception {

        String script = "To get there I will:\n" +
                " - Read Talking with Tech Leads book\n" +
                " - Blog about being a Tech Lead\n";

        mockMvc.perform(post("/api/jarvis/editor").content(script))
                .andExpect(status().isOk())
                .andExpect(content()
                        .string("add Action Item 'Read Talking with Tech Leads book'\n" +
                                "add Action Item 'Blog about being a Tech Lead'\n"));

    }

    @Test
    public void createFeedbackInLowLevelCode() throws Exception {

        String script = "The great feedback that I got was:\n" +
                    "  From: Linda\n" +
                    "  - Good with people\n" +
                    "  - Help to put all leads together\n";

        mockMvc.perform(post("/api/jarvis/editor").content(script))
                .andExpect(status().isOk())
                .andExpect(content()
                        .string("receive Great Feedback from Linda: Good with people\n" +
                                "receive Great Feedback from Linda: Help to put all leads together\n"));

    }
}

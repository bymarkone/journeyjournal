package com.thoughtworks.jj.twdsl.rest;

import com.thoughtworks.techdashboard.TechDashboardApplication;
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
@SpringApplicationConfiguration(classes = TechDashboardApplication.class)
@WebAppConfiguration
@ActiveProfiles("test")
public class TextTechDashboardCompilerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void init() {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void createsACity() throws Exception {
    String script = "> Recife\n";
    mockMvc.perform(post("/api/tech-dashboard/editor").content(script))
        .andExpect(status().isOk());

    mockMvc.perform(get("/api/tech-dashboard/city"))
        .andExpect(jsonPath("$[0].name", is("Recife")))
        .andExpect(status().isOk());
  }

  @Test
  public void createsAnAccount() throws Exception {
    String script = "> Recife\n-- Account: SouthWest\n";
    mockMvc.perform(post("/api/tech-dashboard/editor").content(script))
        .andExpect(status().isOk());

    mockMvc.perform(get("/api/tech-dashboard/city/Recife"))
        .andExpect(jsonPath("$[0].name", is("Recife")))
        .andExpect(status().isOk());
  }

}

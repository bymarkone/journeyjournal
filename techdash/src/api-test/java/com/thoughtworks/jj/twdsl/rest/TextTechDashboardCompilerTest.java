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
    String script = "> Recife\n-- Account: Bank\n";
    mockMvc.perform(post("/api/tech-dashboard/editor").content(script))
        .andExpect(status().isOk());

    mockMvc.perform(get("/api/tech-dashboard/city/Recife/account"))
        .andExpect(jsonPath("$[0].name", is("Bank")))
        .andExpect(status().isOk());
  }

  @Test
  public void createsAProject() throws Exception {
    String script = "> Recife\n-- Account: BigBank\n" +
        "Project: EDO\n" +
        "|- TechLeads: Froes, Girão\n" +
        "|- BusinessDomains: Banking\n" +
        "|- Technologies: Java, Java Web\n";
    mockMvc.perform(post("/api/tech-dashboard/editor").content(script))
        .andExpect(status().isOk());

    mockMvc.perform(get("/api/tech-dashboard/city/Recife/account/BigBank/project"))
        .andExpect(jsonPath("$[0].name", is("EDO")))
        .andExpect(jsonPath("$[0].techLeads[0]", is("Froes")))
        .andExpect(jsonPath("$[0].techLeads[1]", is("Girão")))
        .andExpect(jsonPath("$[0].technologies[0]", is("Java")))
        .andExpect(jsonPath("$[0].technologies[1]", is("Java Web")))
        .andExpect(jsonPath("$[0].businessDomains[0]", is("Banking")))
        .andExpect(status().isOk());
  }

}

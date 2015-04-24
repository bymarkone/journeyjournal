package com.thoughtworks.techdashboard.domain;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
@AllArgsConstructor
public class Project {

  private String name;
  private List<String> techLeads;
  private List<String> technologies;
  private List<String> businessDomains;

  public Project(String name) {
    this(name, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
  }
}

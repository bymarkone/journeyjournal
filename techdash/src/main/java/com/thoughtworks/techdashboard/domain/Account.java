package com.thoughtworks.techdashboard.domain;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
@AllArgsConstructor
public class Account {

  private String name;
  private List<Project> projects;

  public Account(String name) {
    this(name, new ArrayList<>());
  }

}

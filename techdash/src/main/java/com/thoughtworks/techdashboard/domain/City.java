package com.thoughtworks.techdashboard.domain;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
@AllArgsConstructor
public class City {

  private String name;
  private List<Account> accounts;

  public City(String name) {
    this(name, new ArrayList<>());
  }
}

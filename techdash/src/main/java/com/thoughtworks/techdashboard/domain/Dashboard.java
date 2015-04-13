package com.thoughtworks.techdashboard.domain;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class Dashboard {

  private List<City> cities;

  public Dashboard() {
    cities = new ArrayList<>();
  }
}

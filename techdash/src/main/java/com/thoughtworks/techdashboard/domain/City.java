package com.thoughtworks.techdashboard.domain;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Value
@AllArgsConstructor
public class City {

  private String name;
  private List<Account> accounts;

  public City(String name) {
    this(name, new ArrayList<>());
  }

  public Stream<Account> accountStream() {
    return accounts.stream();
  }

}

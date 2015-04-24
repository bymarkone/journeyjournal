package com.thoughtworks.techdashboard.domain;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class DashboardRepository {

  public static Dashboard dashboard;

  public static Stream<City> cities() {
    return dashboard.getCities().stream();
  }

  public static Optional<City> city(String name) {
    return cities().filter(city -> name.equals(city.getName())).findFirst();
  }

  public static Stream<Account> accounts(String cityName) {
    return city(cityName).map(City::getAccounts).get().stream();
  }

  private static Optional<Account> account(String cityName, String accountName) {
    return accounts(cityName).filter(account -> accountName.equals(account.getName())).findFirst();
  }

  public static List<Project> projects(String cityName, String accountName) {
    return account(cityName, accountName).map(Account::getProjects).get();
  }
}

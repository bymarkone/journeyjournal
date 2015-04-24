package com.thoughtworks.techdashboard.rest;

import com.thoughtworks.techdashboard.domain.Account;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor @NoArgsConstructor
public class AccountRepresentation extends ResourceSupport {

  private String name;
  private List<ProjectRepresentation> projects;

  public static AccountRepresentation build(Account account) {
    return new AccountRepresentation(account.getName(), new ArrayList<>());
  }

}

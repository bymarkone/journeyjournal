package com.thoughtworks.techdashboard.rest;

import com.thoughtworks.techdashboard.domain.DashboardRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api/tech-dashboard/city/{cityName}/account")
public class AccountResource {

  @RequestMapping(method = GET)
  public HttpEntity<List<AccountRepresentation>> process(@PathVariable String cityName) {
    List<AccountRepresentation> accounts = DashboardRepository.accounts(cityName).map(AccountRepresentation::build).collect(Collectors.toList());
    return new ResponseEntity<>(accounts, OK);
  }

}

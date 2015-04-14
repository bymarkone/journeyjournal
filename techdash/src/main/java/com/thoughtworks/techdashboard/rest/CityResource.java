package com.thoughtworks.techdashboard.rest;

import com.thoughtworks.techdashboard.domain.City;
import com.thoughtworks.techdashboard.domain.DashboardRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api/tech-dashboard/city")
public class CityResource {

  @RequestMapping(method = GET)
  public HttpEntity<List<City>> process() {
    List<City> cities = DashboardRepository.dashboard.getCities();
    return new ResponseEntity<>(cities, OK);
  }

}

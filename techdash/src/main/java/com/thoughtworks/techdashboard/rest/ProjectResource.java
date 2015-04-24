package com.thoughtworks.techdashboard.rest;

import com.thoughtworks.techdashboard.domain.DashboardRepository;
import com.thoughtworks.techdashboard.domain.Project;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api/tech-dashboard/city/{cityName}/account/{accountName}/project")
public class ProjectResource {

  @RequestMapping(method = GET)
  public HttpEntity<List<Project>> process(@PathVariable String cityName, @PathVariable String accountName) {
    List<Project> projects = DashboardRepository.projects(cityName, accountName);
    return new ResponseEntity<>(projects, OK);
  }

}

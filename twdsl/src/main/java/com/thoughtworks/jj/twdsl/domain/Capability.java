package com.thoughtworks.jj.twdsl.domain;

import lombok.Value;

import java.util.List;

@Value
public class Capability {

    String name;
    String mission;
    List<Goal> goals;

}

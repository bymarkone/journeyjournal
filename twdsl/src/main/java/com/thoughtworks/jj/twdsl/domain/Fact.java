package com.thoughtworks.jj.twdsl.domain;

import lombok.Value;

@Value
public class Fact {
    private String group;
    private String when;
    private String description;
}

package com.thoughtworks.jj.twdsl.domain;

import lombok.Value;

@Value
public class Feedback {

    private String description;
    private String from;
    private String quality;

}

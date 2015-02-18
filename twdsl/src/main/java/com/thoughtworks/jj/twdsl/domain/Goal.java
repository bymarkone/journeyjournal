package com.thoughtworks.jj.twdsl.domain;

import lombok.Value;

import java.util.List;

@Value
public class Goal {
    String description;
    List<ActionItem> actionItems;
}

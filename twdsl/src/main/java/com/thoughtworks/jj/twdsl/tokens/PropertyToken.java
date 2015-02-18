package com.thoughtworks.jj.twdsl.tokens;

import lombok.Value;

@Value
public class PropertyToken {

    private String propertyName;
    private String propertyValue;

}

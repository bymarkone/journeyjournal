package com.thoughtworks.jj.twdsl.tokens;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @ToString
public class PropertiesToken {

    private List<PropertyToken> propertyTokens;

    public PropertiesToken() {
        propertyTokens = new ArrayList<>();
    }

}

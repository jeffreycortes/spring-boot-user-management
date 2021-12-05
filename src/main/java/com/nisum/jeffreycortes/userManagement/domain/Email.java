package com.nisum.jeffreycortes.userManagement.domain;

public class Email {
    private String Value;
    private String RegularExpressionFormat = "aa";

    public Email(String value) {
        Value = value;
    }

    public String getValue() {
        return Value;
    }

    boolean isValid() {
        return false;
    }
}

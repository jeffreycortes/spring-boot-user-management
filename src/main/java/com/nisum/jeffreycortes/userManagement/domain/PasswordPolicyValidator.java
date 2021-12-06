package com.nisum.jeffreycortes.userManagement.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Configuration
@ConfigurationProperties(prefix = "userpassword")
public class PasswordPolicyValidator {
    String policyformatregex;

    public void setPolicyformatregex(String policyformatregex) {
        this.policyformatregex = policyformatregex;
    }

    public Boolean isPasswordValid(String password) {
        Pattern POLICY_FORMAT_REGEX = Pattern.compile(policyformatregex);
        Matcher matcher = POLICY_FORMAT_REGEX.matcher(password);
        return matcher.find();
    }
}

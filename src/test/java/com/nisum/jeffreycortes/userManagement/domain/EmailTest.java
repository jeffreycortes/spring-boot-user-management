package com.nisum.jeffreycortes.userManagement.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailTest {
    @Test()
    public void createEmailSuccess() {
        String emailParam = "jcortes@gmail.com";
        Email email = new Email(emailParam);
        Assertions.assertEquals(email.getValue(), emailParam);
    }

    @Test()
    public void createEmailWithNullValue() {
        String emailParam = null;
        Assertions.assertThrows(InvalidEmailException.class, ()-> new Email(emailParam));
    }

    @Test()
    public void createEmailWithInvalidValue() {
        String emailParam = "123";
        Assertions.assertThrows(InvalidEmailException.class, ()-> new Email(emailParam));
    }
}

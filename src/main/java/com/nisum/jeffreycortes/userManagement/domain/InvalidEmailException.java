package com.nisum.jeffreycortes.userManagement.domain;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException() {
        super("email no válido");
    }
}

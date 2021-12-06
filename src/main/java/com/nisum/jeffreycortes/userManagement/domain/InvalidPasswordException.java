package com.nisum.jeffreycortes.userManagement.domain;

public class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException() {
        super("La contraseña no cumple la pólitica de seguridad. Tenga en cuenta que debe componerse de: mínimo 8 caracteres, 1 letra mínuscula, 1 letra mayúscula, 1 caracter especial, 0 espacios");
    }
}
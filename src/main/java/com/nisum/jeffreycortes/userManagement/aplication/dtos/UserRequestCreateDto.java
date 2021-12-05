package com.nisum.jeffreycortes.userManagement.aplication.dtos;

import com.nisum.jeffreycortes.userManagement.domain.Phone;

import java.util.List;

public class UserRequestCreateDto {
    String name = null;
    String email = null;
    String password = null;
    List<Phone> phones = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}

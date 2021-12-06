package com.nisum.jeffreycortes.userManagement.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ExceptionResponse {
    String message;

    public ExceptionResponse(String message) {
        this.message = message;
    }
}

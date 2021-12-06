package com.nisum.jeffreycortes.userManagement.infrastructure.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.nisum.jeffreycortes.userManagement.aplication.dtos.UserCreatedResponse;
import com.nisum.jeffreycortes.userManagement.aplication.dtos.UserRequestCreateDto;
import com.nisum.jeffreycortes.userManagement.aplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(produces="application/json")
    public String ping() {
        return "{\"message\": \"UserController ready ;)\"}";
    }

    @PostMapping
    public UserCreatedResponse createUser(@Valid @RequestBody UserRequestCreateDto userDto, BindingResult result) {
        return userService.create(userDto);
    }
}

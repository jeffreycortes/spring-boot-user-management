package com.nisum.jeffreycortes.userManagement.infrastructure.controllers;

import com.nisum.jeffreycortes.userManagement.aplication.dtos.UserCreatedResponse;
import com.nisum.jeffreycortes.userManagement.aplication.dtos.UserRequestCreateDto;
import com.nisum.jeffreycortes.userManagement.aplication.services.UserService;
import com.sun.media.sound.InvalidDataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String ping() {
        return "UserController ready ;)";
    }

    @PostMapping
    public UserCreatedResponse createUser(@Valid @RequestBody UserRequestCreateDto userDto, BindingResult result) {
        return userService.create(userDto);
    }
}

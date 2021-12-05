package com.nisum.jeffreycortes.userManagement.infrastructure.controllers;

import com.nisum.jeffreycortes.userManagement.aplication.dtos.UserCreatedResponse;
import com.nisum.jeffreycortes.userManagement.aplication.dtos.UserRequestCreateDto;
import com.nisum.jeffreycortes.userManagement.aplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public UserCreatedResponse createUser(@RequestBody UserRequestCreateDto userDto) throws Exception {
        return userService.Create(userDto);
    }
}

package com.example.apiLoginEchargetrack.controller;

import com.example.apiLoginEchargetrack.entity.User;
import com.example.apiLoginEchargetrack.service.ApiEchargeTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class ApiEchargeTrackController {

    @Autowired
    private ApiEchargeTrackService userService;

    @PostMapping("/store")
    public User salvaUsuario(@RequestBody User user) {
        return userService.salvarUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable UUID id) {
        return userService.obterUserPorId(id);
    }

}

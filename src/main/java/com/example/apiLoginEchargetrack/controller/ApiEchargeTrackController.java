package com.example.apiLoginEchargetrack.controller;

import com.example.apiLoginEchargetrack.entity.Charge;
import com.example.apiLoginEchargetrack.entity.User;
import com.example.apiLoginEchargetrack.service.ApiEchargeTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class ApiEchargeTrackController {

    @Autowired
    private ApiEchargeTrackService apiService;



    @PostMapping("/login")
    public User login(@RequestBody User userLogin) {
        User user = apiService.obterUserPorEmail(userLogin.getEmail());
        if (user != null && user.getPassword().equals(userLogin.getPassword())) {
            return user;
        } else {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Falha no login");
        }
    }

        @PostMapping
    public User salvaUsuario(@RequestBody User user) {
        return apiService.salvarUser(user);
    }

    @PostMapping("/newCharge")
    public Charge createCharge (@RequestBody Charge charge) {
        return apiService.salvaCharge(charge);
    }
}

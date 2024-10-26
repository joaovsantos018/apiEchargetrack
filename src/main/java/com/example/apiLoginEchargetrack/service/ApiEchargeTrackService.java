package com.example.apiLoginEchargetrack.service;

import com.example.apiLoginEchargetrack.entity.User;

import java.util.List;
import java.util.UUID;

public interface ApiEchargeTrackService {
    List<User> listUsers();


    User obterUserPorId(UUID userId);

    User obterUserPorEmail(String email);

    User salvarUser(User user);

    boolean excluirUser(UUID userId);
}

package com.example.apiLoginEchargetrack.service;

import com.example.apiLoginEchargetrack.entity.Charge;
import com.example.apiLoginEchargetrack.entity.User;

import java.util.List;
import java.util.UUID;

public interface ApiEchargeTrackService {
    List<User> listUsers();


    User obterUserPorId(UUID userId);

    User obterUserPorEmail(String email);

    User salvarUser(User user);

    boolean excluirUser(UUID userId);

    boolean excluirCarga(UUID idCarga);

    List<Charge> listCharges();

    Charge salvaCharge(Charge charge);

    Charge atualizaCarga(UUID userId, Charge charge);

}

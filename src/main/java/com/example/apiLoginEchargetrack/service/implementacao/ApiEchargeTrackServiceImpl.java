package com.example.apiLoginEchargetrack.service.implementacao;

import com.example.apiLoginEchargetrack.entity.Charge;
import com.example.apiLoginEchargetrack.entity.User;
import com.example.apiLoginEchargetrack.repository.ApiEchargeTrackRepository;
import com.example.apiLoginEchargetrack.repository.ChargeApiRepository;
import com.example.apiLoginEchargetrack.service.ApiEchargeTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ApiEchargeTrackServiceImpl implements ApiEchargeTrackService {

    @Autowired
    private ApiEchargeTrackRepository apiEchargeTrackRepository;

    @Autowired
    private ChargeApiRepository chargeApiRepository;

    @Override
    public List<User> listUsers() {
        return apiEchargeTrackRepository.findAll();
    }

    @Override
    public User obterUserPorId(UUID userId) {
        return apiEchargeTrackRepository.findById(userId).orElse(null);
    }
    public User obterUserPorEmail(String email) {
        return apiEchargeTrackRepository.findByEmail(email);
    }


    @Override
    public User salvarUser(User user) {
        return apiEchargeTrackRepository.save(user);
    }

    @Override
    public boolean excluirUser(UUID userId) {
        apiEchargeTrackRepository.deleteById(userId);
        return true;
    }

    @Override
    public boolean excluirCarga(UUID idCarga) {
        chargeApiRepository.deleteById(idCarga);
        return true;
    }

    @Override
    public List<Charge> listCharges () {
        return chargeApiRepository.findAll();
    }

    @Override
    public Charge salvaCharge(Charge charge) {
        return chargeApiRepository.save(charge);
    }

    @Override
    public Charge atualizaCarga(UUID idCarga, Charge charge) {
        charge.setIdCarga(idCarga);
        return chargeApiRepository.save(charge);
    }

}

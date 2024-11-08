package com.example.apiLoginEchargetrack.repository;

import com.example.apiLoginEchargetrack.entity.Charge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ChargeApiRepository extends JpaRepository <Charge, UUID> {
}

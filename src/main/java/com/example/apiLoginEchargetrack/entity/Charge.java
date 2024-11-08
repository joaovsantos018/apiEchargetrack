package com.example.apiLoginEchargetrack.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Charge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCarga;

    private String modeloCarro;

    @Column(name = "data_carga")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCarga;

    private int tempoCarga;

    private String nivelCarregador;

    private double precoKWH;
}

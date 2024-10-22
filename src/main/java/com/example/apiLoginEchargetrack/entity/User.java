package com.example.apiLoginEchargetrack.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.UUID;

@Data // Isso vai gerar os métodos get, set, toString, equals, e hashCode
@NoArgsConstructor // Construtor sem argumentos gerado automaticamente
@AllArgsConstructor // Construtor com todos os argumentos
@Entity
@Table(name = "echargeUsers")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;

    private String email;

    private String password;

    private String nome;

    private String celular;

    private String tipoUsuario;

    // Construtor com todos os parâmetros
    public User(String userId, String email, String password, String nome, String celular, String tipoUsuario) {
        this.userId = UUID.fromString(userId);
        this.email = email;
        this.password = password;
        this.nome = nome;
        this.celular = celular;
        this.tipoUsuario = tipoUsuario;
    }
}

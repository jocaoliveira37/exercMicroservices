package com.ExercProducer.ExercicioProducer.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLogin {
    private String id;
    private String nome;
    private String usuario;
    private String senha;
    private String token;
    private String tipo;
    private String endereço;
}

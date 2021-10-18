package com.ExercProducer.ExercicioProducer.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    private long id;
    @NonNull
    private String nome;
    @NonNull
    private String senha;
    @NonNull
    private String usuario;
    @NonNull
    private String tipo;
    private String endereço;
    private String email;
}

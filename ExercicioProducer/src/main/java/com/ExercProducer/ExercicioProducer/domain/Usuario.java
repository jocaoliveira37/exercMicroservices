package com.ExercProducer.ExercicioProducer.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuarios")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {


    @Id
    private String id;
    @NonNull
    private String nome;
    @NonNull
    private String senha;
    @NonNull
    @Indexed(unique = true)
    private String usuario;
    @NonNull
    private String tipo;
    private String endereco;
}

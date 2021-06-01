package com.exercicioConsumer.ExercicioConsumer.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Consumer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Postagem  {


    @Id
    private String id;
    private String nome;
    private String message;
}

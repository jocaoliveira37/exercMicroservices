package com.exercicioConsumer.ExercicioConsumer.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Consumer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Postagem  {


    @Id
    private String id;
    private String nome;
    private String message;
}

package com.ExercProducer.ExercicioProducer.domain;


import lombok.*;



@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Postagem {

    private Long id;
    private String nome;
    private String message;
}

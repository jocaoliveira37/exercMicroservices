package com.exercicioConsumer.ExercicioConsumer.repository;

import com.exercicioConsumer.ExercicioConsumer.domain.Postagem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends MongoRepository<Postagem, String> {

}

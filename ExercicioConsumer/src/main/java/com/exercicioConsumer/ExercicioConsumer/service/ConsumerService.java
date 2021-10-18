package com.exercicioConsumer.ExercicioConsumer.service;

import com.exercicioConsumer.ExercicioConsumer.domain.Postagem;
import com.exercicioConsumer.ExercicioConsumer.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    public List<Postagem> getAll() {
        return this.consumerRepository.findAll();
    }
}

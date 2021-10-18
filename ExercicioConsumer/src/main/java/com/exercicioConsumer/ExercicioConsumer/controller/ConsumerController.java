package com.exercicioConsumer.ExercicioConsumer.controller;

import com.exercicioConsumer.ExercicioConsumer.domain.Postagem;
import com.exercicioConsumer.ExercicioConsumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;


    @GetMapping
    public List<Postagem> findAll() {
        return consumerService.getAll();
    }
}


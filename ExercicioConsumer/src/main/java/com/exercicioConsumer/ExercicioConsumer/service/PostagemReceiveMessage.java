package com.exercicioConsumer.ExercicioConsumer.service;

import com.exercicioConsumer.ExercicioConsumer.domain.Postagem;
import com.exercicioConsumer.ExercicioConsumer.repository.ConsumerRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PostagemReceiveMessage {

    @Autowired
    private ConsumerRepository consumerRepository;


    @RabbitListener(queues = {"${postagem.rabbitmq.queue}"})
    public void receiveMessage(@Payload Postagem postagem){
        consumerRepository.save(postagem);
    }
}

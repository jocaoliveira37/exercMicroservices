package com.exercicioConsumer.ExercicioConsumer.config;

import com.exercicioConsumer.ExercicioConsumer.domain.Postagem;
import com.exercicioConsumer.ExercicioConsumer.repository.ConsumerRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class PostagemReceiveMessage {

    private final ConsumerRepository consumerRepository;

    @Autowired
    public PostagemReceiveMessage(ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }

    @RabbitListener(queues = {"${postagem.rabbitmq.queue}"})
    public void receiveMessage(@Payload Postagem postagem){
        consumerRepository.save(postagem);
    }
}

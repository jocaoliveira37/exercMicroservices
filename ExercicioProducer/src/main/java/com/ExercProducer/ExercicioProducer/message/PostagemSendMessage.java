package com.ExercProducer.ExercicioProducer.message;


import com.ExercProducer.ExercicioProducer.domain.Postagem;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PostagemSendMessage {

    @Value("${postagem.rabbitmq.exchange}")
    String exchange;
    @Value("${postagem.rabbitmq.routingkey}")
    String routingKey;

    public final RabbitTemplate rabbitTemplate;

    @Autowired
    public PostagemSendMessage(RabbitTemplate rabbitTemplate) { this.rabbitTemplate = rabbitTemplate; }

    public void sendMessage(Postagem postagem){
        rabbitTemplate.convertAndSend(exchange, routingKey, postagem);
    }
}

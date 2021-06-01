package com.ExercProducer.ExercicioProducer.service;


import com.ExercProducer.ExercicioProducer.domain.Postagem;
import com.ExercProducer.ExercicioProducer.message.PostagemSendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostagemService {

    private final PostagemSendMessage postagemSendMessage;

    @Autowired
    public PostagemService(PostagemSendMessage postagemSendMessage) {
        this.postagemSendMessage = postagemSendMessage;
    }

    public Postagem send(Postagem postagem){
        postagemSendMessage.sendMessage(postagem);
        return postagem;
    }
}

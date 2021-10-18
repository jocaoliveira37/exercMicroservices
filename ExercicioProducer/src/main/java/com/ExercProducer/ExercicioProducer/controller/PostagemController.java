package com.ExercProducer.ExercicioProducer.controller;


import com.ExercProducer.ExercicioProducer.domain.Postagem;
import com.ExercProducer.ExercicioProducer.service.PostagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {

    private final PostagemService postagemService;

    @Autowired
    public PostagemController(PostagemService postagemService) {
        this.postagemService = postagemService;
    }

    @PostMapping
    public Postagem send(@RequestBody Postagem postagem){
        return postagemService.send(postagem);
    }
}

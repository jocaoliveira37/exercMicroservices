package com.ExercProducer.ExercicioProducer.repository;

import com.ExercProducer.ExercicioProducer.domain.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

        public Optional<Usuario> findByUsuario(String Usuario);
}


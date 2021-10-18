package com.ExercProducer.ExercicioProducer.service;

import com.ExercProducer.ExercicioProducer.domain.UserLogin;
import com.ExercProducer.ExercicioProducer.domain.Usuario;
import com.ExercProducer.ExercicioProducer.repository.UsuarioRepository;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario CadastrarUsuario(Usuario usuario) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String senhaEncoder = encoder.encode(usuario.getSenha());
        String nomeEncoder = encoder.encode(usuario.getNome());
        String usuarioEncoder = encoder.encode(usuario.getUsuario());
        String emailEncoder = encoder.encode(usuario.getEmail());
        String endereçoEncoder = encoder.encode(usuario.getEndereço());

        usuario.setSenha(senhaEncoder);
        usuario.setNome(nomeEncoder);
        usuario.setUsuario(usuarioEncoder);
        usuario.setEmail(emailEncoder);
        usuario.setEndereço(endereçoEncoder);

        return repository.save(usuario);
    }

    public Optional<UserLogin> Logar(Optional<UserLogin> user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario());

        if(usuario.isPresent()) {
            if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
                String auth = user.get().getUsuario()+ ":" + user.get().getSenha();
                byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
                String authHeader = "Basic " + new String(encodedAuth);

                user.get().setToken(authHeader);
                user.get().setNome(usuario.get().getNome());
                user.get().setTipo(usuario.get().getTipo());
                user.get().setEmail(usuario.get().getEmail());
                return user;
            }
        }
        return null;
    }

}

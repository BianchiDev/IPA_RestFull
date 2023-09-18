package br.com.bianchi.ipa.config;

import br.com.bianchi.ipa.domain.User;
import br.com.bianchi.ipa.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    UserRepository repository;
    @Bean
    public void startDB(){
        User u2 = new User(null,"iara", "iaralamare@gmail.com", "123");
        User u3 = new User(null,"kayky", "kayky@gmail.com", "123");

        repository.saveAll(List.of(u2, u3));
    }
}

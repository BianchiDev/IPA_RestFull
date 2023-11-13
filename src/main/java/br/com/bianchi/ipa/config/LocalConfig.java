package br.com.bianchi.ipa.config;

import br.com.bianchi.ipa.domain.Users;
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
  private UserRepository repository;

  @Bean
  public void startDB() {
    Users u2 = new Users(null, "iara", "iaralamare@gmail.com", "123");
    Users u3 = new Users(null, "kayky", "kayky@gmail.com", "123");
    Users u4 = new Users(null, "bianchi", "bainchi@gmail.com", "123");

    repository.saveAll(List.of(u2, u3, u4));
  }
}

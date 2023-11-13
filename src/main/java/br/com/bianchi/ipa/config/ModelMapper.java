package br.com.bianchi.ipa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.bianchi.ipa.domain.Users;
import br.com.bianchi.ipa.domain.dto.UserDTO;

@Configuration
public class ModelMapper {
    

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }

    public Object map(Users findById, Class<UserDTO> class1) {
        return UserDTO.class;
    }
}

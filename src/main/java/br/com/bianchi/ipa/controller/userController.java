package br.com.bianchi.ipa.controller;

import br.com.bianchi.ipa.config.ModelMapper;
import br.com.bianchi.ipa.domain.dto.UserDTO;
import br.com.bianchi.ipa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class userController {

    @Autowired
    private ModelMapper  mapper;

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<Object> finfById(@PathVariable Integer id){
        return ResponseEntity.ok().body(mapper.map(service.findById(id), UserDTO.class));
    }

   /*  @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO>findById(@PathVariable  Integer id){
    return ResponseEntity.ok().body(mapper.map(service.findById(id), UserDTO.class));
        //return ResponseEntity.ok().body(new User(1,"Bianchi","bianchi321@gmail.com", "123"));
    } */
}

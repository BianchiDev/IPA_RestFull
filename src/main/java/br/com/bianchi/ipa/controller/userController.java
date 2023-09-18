package br.com.bianchi.ipa.controller;

import br.com.bianchi.ipa.domain.User;
import br.com.bianchi.ipa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class userController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User>findById(@PathVariable  Integer id){
    return ResponseEntity.ok().body(service.findById(id));
        //return ResponseEntity.ok().body(new User(1,"Bianchi","bianchi321@gmail.com", "123"));
    }
}

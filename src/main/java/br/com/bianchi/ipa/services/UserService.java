package br.com.bianchi.ipa.services;

import br.com.bianchi.ipa.domain.Users;

public interface UserService {
    Users findById(Integer id);
}

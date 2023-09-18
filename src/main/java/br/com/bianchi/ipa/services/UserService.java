package br.com.bianchi.ipa.services;

import br.com.bianchi.ipa.domain.User;

public interface UserService {
    User findById(Integer id);
}

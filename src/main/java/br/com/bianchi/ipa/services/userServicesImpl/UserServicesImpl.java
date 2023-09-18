package br.com.bianchi.ipa.services.userServicesImpl;

import br.com.bianchi.ipa.domain.User;
import br.com.bianchi.ipa.repositores.UserRepository;
import br.com.bianchi.ipa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServicesImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}

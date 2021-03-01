package com.v8del2h19robhe.services;

import com.v8del2h19robhe.models.Users;
import com.v8del2h19robhe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SaverContextService {
    @Autowired
    private UserRepository userRepository;

    public List<Users> listAll() {
        return userRepository.findAll(Sort.by("user_email").ascending());
    }

    public Users saveUserMySQL(Users user) {
        return userRepository.save(user);
    }
}

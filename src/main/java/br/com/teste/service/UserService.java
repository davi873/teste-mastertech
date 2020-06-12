package br.com.teste.service;


import br.com.teste.model.User;
import br.com.teste.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser(){
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }

    public User getUserById(Integer id){
        return userRepository.findById(id).get();
    }

    public void saveOrUpdate(User user){
        userRepository.save(user);
    }
}

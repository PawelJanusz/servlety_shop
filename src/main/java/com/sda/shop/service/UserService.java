package com.sda.shop.service;

import com.sda.shop.model.User;
import com.sda.shop.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {

    private static UserService userService;

    public static UserService getInstance(){
        if (userService == null){
            userService = new UserService();
        }
        return userService;
    }
    private UserRepository repository;

    private UserService() {
        repository = UserRepository.getInstance();
    }

    public boolean existsByLogin(String login) {
        return repository.existsByLogin(login);
    }

    public void save(User user){
        repository.save(user);
    }

    public List<User> findAll(){
        return repository.findAll();
    }
    public Optional<User> findUserByLoginAndPassword(String login, String password){
     return repository.findByLoginAndPassword(login, password);
    }
}

package com.sda.shop.repository;

import com.sda.shop.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private static UserRepository userRepository;

    public static UserRepository getInstance(){
        if (userRepository == null){
            userRepository = new UserRepository();
        }
        return userRepository;
    }

    private List<User> users;

    private UserRepository() {
        users = new ArrayList<>();
    }

    public boolean existsByLogin(String login){
        return users.stream()
                .anyMatch(u -> u.getLogin().equalsIgnoreCase(login));
    }
    public void save(User user){
        users.add(user);
    }
    public List<User> findAll(){
        return Collections.unmodifiableList(users);
    }

    public Optional<User> findByLoginAndPassword(String login, String password){
        return users.stream()
                .filter(u -> u.getLogin().equalsIgnoreCase(login) && u.getPassword().equals(password))
                .findFirst();
    }

}

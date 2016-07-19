package com.lioniu.rest;

import com.lioniu.jpa.UserRepository;
import com.lioniu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yongliuli on 16/7/19.
 */
@RestController
public class HelloController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/users")
    public List<User> users() {
        return userRepository.findAll();
    }

    @RequestMapping("/add")
    public User add(@RequestParam String name, @RequestParam int age) {
        User user = new User().setName(name).setAge(age);
        return userRepository.save(user);
    }
}

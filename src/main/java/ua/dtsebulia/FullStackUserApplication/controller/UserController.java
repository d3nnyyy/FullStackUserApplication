package ua.dtsebulia.FullStackUserApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.dtsebulia.FullStackUserApplication.exception.UserNotFoundException;
import ua.dtsebulia.FullStackUserApplication.model.User;
import ua.dtsebulia.FullStackUserApplication.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("{id}")
    User getUserById(@PathVariable Integer id) {
        return userRepository.findById(id)
                .orElseThrow(
                        () -> new UserNotFoundException(id)
                );
    }

    @PostMapping
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }
}

package com.example.docker_devOps.Controller;

import com.example.docker_devOps.Entity.User;
import com.example.docker_devOps.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    @Autowired
    private final UserService userService;

    @GetMapping("get-data")
    public String getData(){
        return "Hello dev Ops team how are you?";
    }

    @PostMapping("register-user")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        User user1 = userService.saveUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }

}

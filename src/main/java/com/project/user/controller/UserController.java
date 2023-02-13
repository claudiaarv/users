package com.project.user.controller;

import com.project.db.entity.Usuario;
import com.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/user")
    public List<Usuario> getAll(){
        return service.getAll();
    }

    @GetMapping("/user/{id}")
    public Usuario getUsuario(@PathVariable String id){
        return service.getUsuario(id);
    }
    @PostMapping("/user")
    public Usuario newUser(@RequestBody Usuario usuario){
        return service.newUser(usuario);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id){
        service.deleteUser(id);
    }

}

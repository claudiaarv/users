package com.project.user.service;

import com.project.db.entity.Usuario;
import com.project.user.remote.DBRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    DBRemote dbRemote;

    public List<Usuario> getAll() {
        return dbRemote.getAll();
    }

    public Usuario getUsuario(String id) {
        return dbRemote.getUsuario(id);
    }

    public Usuario newUser(Usuario usuario) {
        return dbRemote.newUser(usuario);
    }

    public void deleteUser(String id) {
        dbRemote.deleteUser(id);
    }
}

package com.project.user.remote;

import com.project.db.entity.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@FeignClient(name="MSO-DB")
public interface DBRemote {

    @RequestMapping (method=GET, value ="user", produces="application/json")
    List<Usuario> getAll();

    @RequestMapping (method=GET, value ="user/{id}", produces="application/json")
    Usuario getUsuario(@PathVariable String id);

    @RequestMapping (method=POST, value ="user", produces="application/json", consumes = "application/json")
    Usuario newUser(Usuario usuario);

    @RequestMapping (method=DELETE, value ="user/{id}")
    void deleteUser(@PathVariable String id);
}

package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.usuarioModel;
import com.example.demo.services.UserService;

@RestController

@RequestMapping("/usuario")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<usuarioModel> obtenerUsuarios() {
        return userService.obtenerUsuarios();
    }

    @PostMapping
    public usuarioModel guardarUsuario (@RequestBody usuarioModel usuario){
        return this.userService.guardarUsuarios(usuario);
    }
    @GetMapping(path = "/{id}")
    public  Optional <usuarioModel> obtenerUsuarioPorId (@PathVariable("id") long id){
        return  this.userService.obtenerPorId(id);
    }

    @GetMapping ("/query")
    public ArrayList <usuarioModel> obtenerUsuarioPorPrioridad (@RequestParam("prioridad") Integer prioridad){
        return this.userService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping (path = "/{id}")
    public String eliminarPorId (@PathVariable("id") long id) {
        boolean ok = this.userService.eliminarUsuario(id);
        if(ok) {
            return "se elimino el usuario con el id : " + id ;
        }else{
            return "no se pudo eliminar el usuario con el id : " + id;
        }

    }


}

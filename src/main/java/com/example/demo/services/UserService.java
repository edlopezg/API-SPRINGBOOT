package com.example.demo.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.usuarioModel;
import com.example.demo.repositories.UserRepositorie;

import javax.swing.text.html.Option;


@Service
public class UserService {
    @Autowired 
    UserRepositorie userRepositorie;

    
    public ArrayList<usuarioModel> obtenerUsuarios(){
        return (ArrayList<usuarioModel>) userRepositorie.findAll();

    } 

    public usuarioModel guardarUsuarios (usuarioModel usuario) {
        return userRepositorie.save(usuario);

    }

    public Optional <usuarioModel> obtenerPorId(Long id){
        return userRepositorie.findById(id);
    }

    public ArrayList<usuarioModel> obtenerPorPrioridad(Integer prioridad){
        return userRepositorie.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(long id){
        try {
            userRepositorie.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

}

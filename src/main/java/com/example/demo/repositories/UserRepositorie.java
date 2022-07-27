package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.usuarioModel;

import java.util.ArrayList;

// Al agregar @Repository le estamos indicando al programma que este es el tipo
@Repository
//Al  usar 'interface' le estamos indicando al codigo que vamos a estar trabajando con varios metodos que vamos a extender de CRUDREPOSITORY este utimo ya esta definido y programado
public interface UserRepositorie extends CrudRepository <usuarioModel, Long> {
    public abstract ArrayList<usuarioModel> findByPrioridad(Integer prioridad);
}

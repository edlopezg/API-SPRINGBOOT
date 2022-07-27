package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//es para establecer el modelo real 
@Entity
// Esta anotacion es para cambiarle el nombre a la tabla, ahora se llamara usuario
@Table(name = "users") 
public class usuarioModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique =  true, nullable = false)
    private Long id;

    private String name;
    private String email;
    private Integer prioridad;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
     
    
}

package com.primeiroSpring.usuarioDepartamento.entities;


import javax.persistence.*;

@Entity
@Table(name= "tb_department")
public class Departament {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;

    public Departament(){

    }

    public Departament(Long id, String name) {
        this.id = id;
        Name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

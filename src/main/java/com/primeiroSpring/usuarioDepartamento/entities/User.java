package com.primeiroSpring.usuarioDepartamento.entities;


import javax.persistence.*;

@Entity
@Table(name= "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;


    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departament departament;

    public  User(){

    }


    public User(Long id, String nome, String email, Departament departament) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.departament = departament;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
}

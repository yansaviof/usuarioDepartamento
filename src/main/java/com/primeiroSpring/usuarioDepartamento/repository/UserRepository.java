package com.primeiroSpring.usuarioDepartamento.repository;

import com.primeiroSpring.usuarioDepartamento.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}

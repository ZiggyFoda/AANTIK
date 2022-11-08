package com.aantik.demo.GaboPrivado;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aantik.demo.GaboPrivado.Password_reset;

public interface  PswrdRepo extends JpaRepository<Password_reset, String> {
    Optional<Password_reset> findById(String id);
}

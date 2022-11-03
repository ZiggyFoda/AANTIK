package com.aantik.demo.GaboPrivado;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aantik.demo.GaboPrivado.UserG;

@Repository
public interface UserRepository extends JpaRepository<UserG, Long> {
	Optional<UserG> findByUsername(String username);

	Boolean existsByUsername(String username);

}

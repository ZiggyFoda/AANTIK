package com.aantik.demo.GaboPrivado;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aantik.demo.GaboPrivado.ERole;
import com.aantik.demo.GaboPrivado.RoleG;

@Repository
public interface RoleRepository extends JpaRepository<RoleG, Long> {
	Optional<RoleG> findByName(ERole name);
}

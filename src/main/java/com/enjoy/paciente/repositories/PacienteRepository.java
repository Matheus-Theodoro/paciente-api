package com.enjoy.paciente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enjoy.paciente.domain.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}

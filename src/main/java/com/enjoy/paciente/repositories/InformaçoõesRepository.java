package com.enjoy.paciente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enjoy.paciente.domain.Informações;

@Repository
public interface InformaçoõesRepository extends JpaRepository<Informações, Long>{

}

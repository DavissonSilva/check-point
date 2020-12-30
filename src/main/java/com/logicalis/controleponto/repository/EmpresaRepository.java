package com.logicalis.controleponto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logicalis.controleponto.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	Empresa findByCnpj(String cnpj);
}

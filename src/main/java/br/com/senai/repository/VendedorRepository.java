package br.com.senai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

}

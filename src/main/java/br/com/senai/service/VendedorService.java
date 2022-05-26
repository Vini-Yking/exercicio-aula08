package br.com.senai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.exception.VendedorException;
import br.com.senai.model.Vendedor;
import br.com.senai.repository.VendedorRepository;

@Service
public class VendedorService {

	@Autowired
	private VendedorRepository vendedorRepository;
	
	public List<Vendedor> listar(){
		return vendedorRepository.findAll();
	}
	
	public Vendedor buscar(Long id) {
		Optional<Vendedor> vendedornovo = vendedorRepository.findById(id);
		if(vendedornovo.isEmpty()) {
			throw new VendedorException("Vendedor não encontrado");
		}
		vendedorRepository.save(vendedornovo.get());
		return vendedornovo.get();
	}
}

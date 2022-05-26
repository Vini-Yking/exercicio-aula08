package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.model.Vendedor;
import br.com.senai.service.VendedorService;

@RequestMapping("/vendedores")
@RestController
public class VendedorController {

	@Autowired
	private VendedorService vendedorService;

	@GetMapping
	public ResponseEntity<List<Vendedor>> listar() {
		List<Vendedor> vendedores = vendedorService.listar();
		return ResponseEntity.ok(vendedores);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Vendedor> buscar(@PathVariable Long id) {

		try {
			Vendedor vendedor = vendedorService.buscar(id);
			return ResponseEntity.ok(vendedor);

		} catch (Exception e) {
			return ResponseEntity.notFound().build();		}

	}
	
	

}

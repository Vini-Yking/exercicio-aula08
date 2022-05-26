package br.com.senai.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class VendedorAutonomo extends Vendedor {

	private BigDecimal comissao;
}

package br.com.senai.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class LancamentoVendas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigoVenda;
	
	private LocalDateTime dataVenda;
	@NotBlank(message="campo não pode ficar em branco")
	
	private BigDecimal valorVenda;
	@ManyToOne
	@JoinColumn(name = "id_vendedor")
	private Vendedor vendedor;
}

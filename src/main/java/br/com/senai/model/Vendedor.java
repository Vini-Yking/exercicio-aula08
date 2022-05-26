package br.com.senai.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@DiscriminatorColumn(name="id_autonomo", discriminatorType = DiscriminatorType.INTEGER, length = 20 )
public class Vendedor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_vendedor")
	private Long codigo;
	@NotBlank
	@Size(max=100,message="{tam}")
	@Column(name = "nome",nullable=false)
	private String nome;
	@NotBlank
	@Size(max=100,message="{tam}")
	@Column(name = "email",nullable=false)
	private String email;
	@NotBlank(message="campo não pode ficar em branco")
	private BigDecimal salario;
	
	@OneToMany(mappedBy = "vendedor")
	private List<LancamentoVendas> lancamentoVendas;
}	


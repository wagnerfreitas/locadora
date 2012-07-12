package br.com.locadora.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "sequence", sequenceName = "cliente_sequence", allocationSize = 1)
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
	private Long id;

	private String nome;

	@OneToMany
	private List<DVD> dvds;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<DVD> getDvds() {
		return dvds;
	}

	public void setDvds(List<DVD> dvds) {
		this.dvds = dvds;
	}
}
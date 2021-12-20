package com.enjoy.paciente.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Paciente {
	
	private long id;
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	
	private List<Informações> informações = new ArrayList<>();

	public Paciente() {
		super();
		}

	public Paciente(long id, String nome, String email, String cpf, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Informações> getInformações() {
		return informações;
	}

	public void setInformações(List<Informações> informações) {
		this.informações = informações;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return id == other.id;
	}
	
	
	
	

}

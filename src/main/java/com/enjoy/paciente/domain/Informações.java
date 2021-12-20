package com.enjoy.paciente.domain;

public class Informações {

	private String consultas_marcadas;
	private String consultas_relizadas;
	private String retornos;
	private String exames;
	private String descrição;

	private Paciente paciente;

	public Informações() {
		super();
	}

	public Informações(String consultas_marcadas, String consultas_relizadas, String retornos, String exames,
			String descrição, Paciente paciente) {
		super();
		this.consultas_marcadas = consultas_marcadas;
		this.consultas_relizadas = consultas_relizadas;
		this.retornos = retornos;
		this.exames = exames;
		this.descrição = descrição;
		this.paciente = paciente;
	}

	public String getConsultas_marcadas() {
		return consultas_marcadas;
	}

	public void setConsultas_marcadas(String consultas_marcadas) {
		this.consultas_marcadas = consultas_marcadas;
	}

	public String getConsultas_relizadas() {
		return consultas_relizadas;
	}

	public void setConsultas_relizadas(String consultas_relizadas) {
		this.consultas_relizadas = consultas_relizadas;
	}

	public String getRetornos() {
		return retornos;
	}

	public void setRetornos(String retornos) {
		this.retornos = retornos;
	}

	public String getExames() {
		return exames;
	}

	public void setExames(String exames) {
		this.exames = exames;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}

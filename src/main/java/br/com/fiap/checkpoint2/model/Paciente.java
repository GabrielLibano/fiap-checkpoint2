package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "pacientes")
public class Paciente extends AbstractEntity<Long>{
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@Column(length = 100)
	private String endereco;
	
	@Column(length = 60)
	private String bairro;
	
	@Column(length = 60)
	private String email;
	
	@Column(length = 13)
	private String telefone_completo;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate data_nascimento;
	
	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDateTime created_at;
	
	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDateTime updated_at;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone_completo() {
		return telefone_completo;
	}

	public void setTelefone_completo(String telefone_completo) {
		this.telefone_completo = telefone_completo;
	}

	public LocalDate getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}
	
}

package br.com.fiap.persistencia.ecommerce.dto;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateClienteDTO {

	@NotNull
	@Size(min = 5, max = 100, message = "Obrigatório no minimo 5 caracteres e no maximo 100.")
	private String nome;

	@Size(min = 5, max = 100, message = "Obrigatório no minimo 5 caracteres e no maximo 100.")
	private String email;

	@Size(max = 2, message = "Limite máximo de 2 dígitos.")
	private Integer ddd;

	@Size(max = 9, message = "Limite máximo de 9 dígitos.")
	private Long telefone;

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cliente")
//	@JsonManagedReference
//	private Set<Pedido> pedidos = new LinkedHashSet<Pedido>();

	private List<EnderecoDTO> enderecos;

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

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public List<EnderecoDTO> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<EnderecoDTO> enderecos) {
		this.enderecos = enderecos;
	}

}
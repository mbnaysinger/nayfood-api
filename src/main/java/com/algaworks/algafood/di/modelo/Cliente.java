package com.algaworks.algafood.di.modelo;

import lombok.Getter;
import lombok.Setter;

public class Cliente {

	@Getter @Setter private String nome;
	@Getter @Setter private String email;
	@Getter @Setter private String telefone;
	@Getter			private boolean ativo = false;

	public Cliente(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public void ativar() {
		this.ativo = true;
	}

}

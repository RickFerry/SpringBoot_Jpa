package br.com.ferry.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.ferry.forum.modelo.Resposta;

public class RespostaDto {
	
	private Long id;
	private String mensagm;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	
	public RespostaDto(Resposta resposta) {
		this.id = resposta.getId();
		this.mensagm = resposta.getMensagem();
		this.dataCriacao = resposta.getDataCriacao();
		this.nomeAutor = resposta.getAutor().getNome();
	}

	public Long getId() {
		return id;
	}

	public String getMensagm() {
		return mensagm;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}
}

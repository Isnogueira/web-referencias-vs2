package br.com.mirante.webservicereferencia.dto;

public class ProdutoDto {

	private String codigo;
	private String descricao;
	private String unidade;

	public ProdutoDto(String codigo, String descricao, String unidade) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.unidade = unidade;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getUnidade() {
		return unidade;
	}
	
}

package com.heider.helpdesk.domain.enums;

public enum Prioridade {

	BAIXA (0, "ROLE_BAIXA"),
	MEDIA (1, "ROLE_MEDIA"),
	ALTA (2, "ROLE_ALTA");
	
	private Integer codigo;
	private String descricao;
	
	private Prioridade(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	

	public static Prioridade toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (Prioridade prioridade : Prioridade.values()) {
			if (cod.equals(prioridade.codigo)) {
				return prioridade;
			}
		}
		throw new IllegalArgumentException("Prioridade inválido");
	}
	
}

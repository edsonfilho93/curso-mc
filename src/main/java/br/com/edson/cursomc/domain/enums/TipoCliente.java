package br.com.edson.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"), 
	PESSOAJURIDICA(2, "Pessoa Jurídica");

	private int codigo;
	private String descricao;

	private TipoCliente(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoCliente toEnum(Integer codigo) {
		TipoCliente tipoCliente = null;

		for (TipoCliente tipo : TipoCliente.values()) {
			if (codigo.equals(tipo.getCodigo())) {
				tipoCliente = tipo;
			}
		}

		if (tipoCliente != null) {
			return tipoCliente;
		} else {
			throw new IllegalArgumentException("Id inválido: " + codigo);
		}
	}
}

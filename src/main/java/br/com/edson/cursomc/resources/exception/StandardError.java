package br.com.edson.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer statusHttp;
	private String mensagem;
	private Long timeStemp;

	public StandardError(Integer statusHttp, String mensagem, Long timeStemp) {
		this.statusHttp = statusHttp;
		this.mensagem = mensagem;
		this.timeStemp = timeStemp;
	}

	public Integer getStatusHttp() {
		return statusHttp;
	}

	public void setStatusHttp(Integer statusHttp) {
		this.statusHttp = statusHttp;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Long getTimeStemp() {
		return timeStemp;
	}

	public void setTimeStemp(Long timeStemp) {
		this.timeStemp = timeStemp;
	}
}

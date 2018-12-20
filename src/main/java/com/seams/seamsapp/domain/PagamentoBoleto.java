package com.seams.seamsapp.domain;

public class PagamentoBoleto implements EstrategiaPagamento{

	private String statusPagamento;

	@Override
	public String pagar() {
		statusPagamento = "Pagamento com boleto " + "realizado com sucesso";

		return statusPagamento;
	}
}

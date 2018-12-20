package com.seams.seamsapp.domain;

public class PagamentoCartao implements EstrategiaPagamento{

	private String statusPagamento;

	@Override
	public String pagar() {
		statusPagamento = "Pagamento com cartão " + "realizado com sucesso";

		return statusPagamento;
	}
}

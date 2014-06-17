package br.com.proxy;

import br.com.estudo.modelo.Conta;

public class ContaProxy implements Conta {

	private Conta conta;

	public ContaProxy(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void deposita(double valor) {
		System.out.println("Deposito de "+valor+" registrado.");
		this.conta.deposita(valor);
	}

	@Override
	public void saca(double valor) {
		System.out.println("Saque de "+valor+" registrado.");
		this.conta.saca(valor);
	}

	@Override
	public double getSaldo() {
		return this.conta.getSaldo();
	}

}

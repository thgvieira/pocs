package br.com.estudo.teste;

import br.com.estudo.factory.FactoryProxy;
import br.com.estudo.modelo.Conta;

public class FactoryTeste {

	public static void main(String[] args) {
		Conta conta = FactoryProxy.getContaProxy();

		conta.deposita(1000.0);
		conta.saca(200.0);
		conta.saca(200.0);

		System.out.println(conta.getSaldo());

	}

}

package br.com.estudo.teste;

import br.com.estudo.factory.FactoryAbstractProxy;
import br.com.estudo.modelo.Conta;
import br.com.estudo.modelo.ContaFisica;
import br.com.estudo.modelo.ContaJuridica;

public class FactoryAbstractTeste {

	public static void main(String[] args) {
		Conta conta = FactoryAbstractProxy.getContaProxy(ContaFisica.class);

		conta.deposita(1000.0);
		conta.saca(200.0);
		conta.saca(200.0);

		System.out.println(conta.getSaldo());
		
		conta = FactoryAbstractProxy.getContaProxy(ContaJuridica.class);

		conta.deposita(2000.0);
		conta.saca(1200.0);
		conta.saca(1800.0);

		System.out.println(conta.getSaldo());

	}

}

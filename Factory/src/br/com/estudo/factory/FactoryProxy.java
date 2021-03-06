package br.com.estudo.factory;

import br.com.estudo.modelo.Conta;
import br.com.estudo.modelo.ContaFisica;
import br.com.estudo.proxy.ContaProxy;

public class FactoryProxy {

	public static Conta getContaProxy() {
		return new ContaProxy(new ContaFisica());
	}

}

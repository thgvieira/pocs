package br.com.estudo.factory;

import br.com.estudo.modelo.Conta;
import br.com.estudo.proxy.ContaProxy;

public class FactoryAbstractProxy {

	public static Conta getContaProxy(Class<?> clazz) {
		ContaProxy contaProxy = null;
		
		try {
			contaProxy = new ContaProxy((Conta) clazz.newInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return contaProxy;
	}

}

package br.com.teste;

import br.com.estudo.modelo.Conta;
import br.com.estudo.modelo.ContaPadrao;
import br.com.proxy.ContaProxy;

public class ContaProxyTeste {

	public static void main(String[] args) {
		Conta conta = new ContaPadrao();
		
		ContaProxy contaProxy = new ContaProxy(conta);
		
		contaProxy.deposita(1000.0);		
		contaProxy.saca(200.0);
		contaProxy.saca(200.0);
		
		System.out.println(contaProxy.getSaldo());
	}

}

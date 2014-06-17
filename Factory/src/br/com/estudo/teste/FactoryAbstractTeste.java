package br.com.estudo.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.estudo.factory.FactoryAbstractProxy;
import br.com.estudo.modelo.Conta;
import br.com.estudo.modelo.ContaFisica;
import br.com.estudo.modelo.ContaJuridica;

public class FactoryAbstractTeste {
	
	@Test
	public void factoryAbstractProxyContaFisica(){
		Conta conta = FactoryAbstractProxy.getContaProxy(ContaFisica.class);

		conta.deposita(1000.0);
		conta.saca(200.0);
		conta.saca(200.0);
		
		Assert.assertTrue(conta.getSaldo() == 600);
	}
	
	@Test(expected = RuntimeException.class)
	public void factoryAbstractProxyContaFisicaEstouroLimite(){
		Conta conta = FactoryAbstractProxy.getContaProxy(ContaFisica.class);

		conta.deposita(1000.0);
		conta.saca(1600.0);		
	}
	
	@Test
	public void factoryAbstractProxyContaJuridica(){
		Conta conta = FactoryAbstractProxy.getContaProxy(ContaJuridica.class);

		conta.deposita(1000.0);
		conta.saca(200.0);
		conta.saca(200.0);
		
		Assert.assertTrue(conta.getSaldo() == 600);
	}
	
	@Test(expected = RuntimeException.class)
	public void factoryAbstractProxyContaJuridicaEstouroLimite(){
		Conta conta = FactoryAbstractProxy.getContaProxy(ContaJuridica.class);

		conta.deposita(1000.0);
		conta.saca(3100.0);		
	}
	
}

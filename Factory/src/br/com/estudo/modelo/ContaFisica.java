package br.com.estudo.modelo;

public class ContaFisica extends ContaBase implements Conta{
	
	public ContaFisica() {
		this.limite = 500;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public void saca(double valor) {
		if (this.saldo + this.limite < valor) {
			throw new RuntimeException("N�o existe saldo para sacar o valor: "+ valor);
		}
		this.saldo -= valor;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

}

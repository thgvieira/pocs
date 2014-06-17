package br.com.estudo.modelo;

public class ContaPadrao implements Conta {

	private double saldo;

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new RuntimeException("Não existe saldo para sacar o valor: "+ valor);
		}
		this.saldo -= valor;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

}

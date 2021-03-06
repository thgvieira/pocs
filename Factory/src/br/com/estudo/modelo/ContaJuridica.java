package br.com.estudo.modelo;

public class ContaJuridica extends ContaBase implements Conta {

	public ContaJuridica() {
		this.limite = 2000;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public void saca(double valor) {
		if (valor > this.limite + this.saldo) {
			throw new RuntimeException("N�o existe limite para sacar o valor: " + valor);
		}

		this.saldo -= valor;

	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

}

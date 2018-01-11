package interfaces2;

class Conta {
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double saldo) {
		this.saldo += saldo;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

}

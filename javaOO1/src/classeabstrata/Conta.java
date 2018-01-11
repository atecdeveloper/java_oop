package classeabstrata;

abstract class Conta {
	protected double saldo;
	
	public abstract void atualiza(double taxa);
	
	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double saldo) {
		this.saldo += saldo;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

}

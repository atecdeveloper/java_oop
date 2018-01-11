package excecaocontrole;

class Conta {
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	// exception which would catch something like a negative number
	public void deposita(double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
			System.out.println("Valor depositado: " + this.saldo);
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

}

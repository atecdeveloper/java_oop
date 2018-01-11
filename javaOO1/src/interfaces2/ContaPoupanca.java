package interfaces2;

class ContaPoupanca extends Conta {
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.1;
	}
}

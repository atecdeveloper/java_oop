package classeabstrata;

class ContaCorrente extends Conta {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	/*public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}*/
}

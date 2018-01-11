package excecaocontrole;

	class TestaDeposita {

	public static void main(String[] args) {
		Conta cp = new ContaCorrente();
		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Saldo: " + cp.getSaldo());
	}

}
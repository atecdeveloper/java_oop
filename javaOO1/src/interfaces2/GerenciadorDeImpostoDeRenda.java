package interfaces2;

public class GerenciadorDeImpostoDeRenda {

	private double total;

	void adiciona(ITributavel t) {
		System.out.println("Adicionando tributavel: " + t);

		this.total += t.calculaTributos();
	}

	public double getTotal() {
		return this.total;
	}
}

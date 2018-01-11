package cohesion;

public class Cnpj {

	protected String valor;

	// constructor
	public Cnpj(String valor) {
		super();
		this.valor = valor;
	}

	// getters setters
	public String getValor() {
		return valor;
	}

	// methods
	public boolean isValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}

	private int primeiroDigitoCorreto() {
		// Calcula o primeiro d�gito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int primeiroDigitoVerificador() {
		// Extrai o primeiro d�gito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}

	private int segundoDigitoCorreto() {
		// Calcula o segundo d�gito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int segundoDigitoVerificador() {
		// Extrai o segundo d�gito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}
}

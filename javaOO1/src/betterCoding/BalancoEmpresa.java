package betterCoding;

import java.util.HashMap;

public class BalancoEmpresa {

	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();

	// Store debt
	public void criarDivida(String nomeCredor, String cnpjCredor, double valor) {
		Divida divida = new Divida(valor, nomeCredor, cnpjCredor);
		dividas.put(cnpjCredor, divida);

	}

	public void pagarDivida(String cnpjCredor, double valor) {
		Divida divida = dividas.get(cnpjCredor);
		if (dividas != null) {
			divida.paga(valor);
		}

	}
}

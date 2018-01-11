package cohesion;

import java.util.HashMap;

public class BalancoEmpresa {
	private HashMap<Cnpj, Divida> dividas = new HashMap<Cnpj, Divida>();

	public void registraDivida(String credor, Cnpj cnpj, double valor) {
		Divida divida = new Divida();
		divida.setTotal(valor);
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpj);
		dividas.put(cnpj, divida);
	}

	public void pagaDivida(Cnpj cnpjCredor, double valor, String nomePagador, String cnpjPagador) {
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			Pagamento pagamento = new Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.registra(pagamento);
		}
	}
}

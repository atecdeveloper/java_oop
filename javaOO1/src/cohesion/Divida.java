package cohesion;

public class Divida {
	
	private double total;
	private Cnpj cnpjCredor;
	private String credor;
	private Pagamentos pagamentos = new Pagamentos();

	// getters setters
	public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}
	
	public Pagamentos getPagamentos() {
		return pagamentos;
	}

	public void setCnpjCredor(Cnpj cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	// Miscellaneous methods
	public double valorAPagar() {
		return this.total - this.pagamentos.getValorPago();
	}
}
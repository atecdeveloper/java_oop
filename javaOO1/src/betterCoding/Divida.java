package betterCoding;

class Divida {

	protected double valTotaldiv;
	protected double valPago;
	protected String nomeCredor;
	protected String cnpjCredor;
	
	public Divida(double valPago, String nomeCredor, String cnpjCredor) {
		super();
		this.valPago = valPago;
		this.nomeCredor = nomeCredor;
		this.cnpjCredor = cnpjCredor;
	}

	public double getValTotaldiv() {
		return valTotaldiv;
	}

	public void setValTotaldiv(double valTotaldiv) {
		this.valTotaldiv = valTotaldiv;
	}

	public String getNomeCredor() {
		return nomeCredor;
	}

	public void setNomeCredor(String nomeCredor) {
		this.nomeCredor = nomeCredor;
	}

	public String getCnpj() {
		return cnpjCredor;
	}

	public void setCnpj(String cnpj) {
		this.cnpjCredor = cnpj;
	}

	public double getValPago() {
		return valPago;
	}
	
	// Pay debt 
	public void paga(double valor) {
		this.valPago += valor;
	}

}

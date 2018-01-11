package cohesion;

public class TestePagamento {

	public static void main(String[] args) {

		Pagamento p1 = new Pagamento();
		Pagamento p2 = new Pagamento();

		p1.setValor(105);
		p2.setValor(25);

		Pagamentos pagamentos1 = new Pagamentos();
		pagamentos1.registra(p1);
		pagamentos1.registra(p2);

		System.out.println("Valor já pago: " + pagamentos1.getValorPago());
	}
}

package interfaces2;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());

		// testar polimorfismo
		ITributavel t = cc;
		System.out.println(t.calculaTributos());

		// System.out.println(t.getSaldo());
	}

}


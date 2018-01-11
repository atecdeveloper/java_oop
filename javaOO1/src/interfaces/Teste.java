package interfaces;

class Teste {
	public static void main(String[] args) {
		IAreaCalculavel a = new Retangulo(3, 2);
		IAreaCalculavel b = new Circulo(5);
		System.out.println(a.calculaArea());
		System.out.println(b.calculaArea());
	}
}

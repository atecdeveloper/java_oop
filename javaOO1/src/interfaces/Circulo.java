package interfaces;

public class Circulo implements IAreaCalculavel {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}

}

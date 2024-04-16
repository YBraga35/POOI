package modelo;

public class Calculadora {

	private double divisor, dividendo, quociente;

	public Calculadora() {

	}

	public double getDivisor() {
		return divisor;
	}

	public double setDivisor(double d) {
		return this.divisor = d;
	}

	public double getDividendo() {
		return dividendo;
	}

	public double setDividendo(double d) {
		return this.dividendo = d;
	}

	public double getQuociente() {
		return quociente;
	}

	public double setQuociente(double quociente) {
		return this.quociente = quociente;
	}

	public void divisao() {
		quociente = (dividendo / divisor);

	}

}

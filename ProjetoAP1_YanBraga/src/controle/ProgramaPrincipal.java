package controle;

import modelo.Calculadora;
import visao.JanelaCalculadora;

public class ProgramaPrincipal {


	public static void main(String[] args) {

		JanelaCalculadora janCalc = new JanelaCalculadora();
		janCalc.setVisible(true);

		Calculadora calc = new Calculadora();
		ControleCalculadora contCalc = new ControleCalculadora(janCalc, calc);
		System.out.println(calc.getQuociente());

	}

}

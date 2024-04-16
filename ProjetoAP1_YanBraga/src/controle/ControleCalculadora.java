package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Calculadora;
import visao.JanelaCalculadora;

public class ControleCalculadora implements ActionListener {

	private JanelaCalculadora janCalc;
	private Calculadora calc;

	public ControleCalculadora(JanelaCalculadora janCalc, Calculadora calc) {
		super();
		this.janCalc = janCalc;
		this.calc = calc;
		resgistraListenerAcao();
	}

	public void resgistraListenerAcao() {
		janCalc.getBtnDividir().addActionListener(this);
		janCalc.getBtnLimpar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Dividir")) {
			if (janCalc.getTextField_PrimeiroNum().getText().equals("")
					|| janCalc.getTextField_SegundoNum().getText().equals("")) {
				System.out.println(
						"NumberFormatException: Ambos campos devem estar preenchidos para seja feita a operação de divisão!");
				janCalc.limpar();
			}

			else {
				double dividendo = Double.parseDouble(janCalc.getTextField_PrimeiroNum().getText());
				double divisor = Double.parseDouble(janCalc.getTextField_SegundoNum().getText());
				this.calc.setDividendo(dividendo);
				this.calc.setDivisor(divisor);
				if (divisor == 0) {
					System.out.println(
							"ArithmeticException: O campo do divisor deve ser preenchido com um valor diferente de 0.0");
					janCalc.limpar();
				} else {
					this.calc.divisao();
					janCalc.getTextFieldResultado().setText(String.valueOf(this.calc.getQuociente()));
				}
			}
		} else if (e.getActionCommand().equals("Limpar")) {
			janCalc.limpar();
		}

	}
}

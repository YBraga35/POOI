package controle;

import modelo.Livro;
import visao.LivrariaInfobio;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		LivrariaInfobio jan = new LivrariaInfobio();
		jan.setVisible(true);
		Livro liv = new Livro();

		LivroControle livCon = new LivroControle(liv, jan);
	}
}

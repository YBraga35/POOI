package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import dao.LivroDAO;
import modelo.Livro;
import visao.LivrariaInfobio;

public class LivroControle implements ActionListener {

	private Livro liv;
	private LivrariaInfobio jan;
	private LivroDAO lidao;

	public LivroControle(Livro liv, LivrariaInfobio jan) {
		super();
		this.liv = liv;
		this.jan = jan;
		registraListenersAcao();
		lidao = new LivroDAO();
	}

	public void registraListenersAcao() {
		jan.getBtnCadastrar().addActionListener(this);
		jan.getBtnConsultar().addActionListener(this);
	}

	public void cadastraLivro() {
		String titulo = jan.getTextFieldTitulo().getText();
		String isbn = jan.getTextFieldISBN().getText();
		String autor = jan.getTextFieldAutor().getText();

		liv.setAutor(autor);
		liv.setIsbn(isbn);
		liv.setTitulo(titulo);

		if (lidao.cadastraLivro(liv)) {
			System.out.println("Dados gravados com sucesso!");
			jan.limparCampos();
		} else
			System.out.println("Falha na gravação do arquivo!");
	}

	public void consultaLivro() {
		String isbn = jan.getTextFieldISBN().getText();
		liv.setIsbn(isbn);

			if(lidao.consultaLivro(liv)) {
				jan.getTextFieldTitulo().setText(liv.getTitulo());
				jan.getTextFieldAutor().setText(liv.getAutor());
			}
			else 
				System.out.println("ISBN não encontrado no arquivo!");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("Cadastrar")) {

			cadastraLivro();
		} else if (e.getActionCommand().equals("Consultar")) {
			consultaLivro();
		}

	}

}

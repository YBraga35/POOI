package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class LivrariaInfobio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldISBN;
	private JTextField textFieldTitulo;
	private JTextField textFieldAutor;
	private JButton btnCadastrar;
	private JButton btnConsultar;

	public LivrariaInfobio() {
		setTitle("Livraria Infobio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(30);
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblTituloPag = new JLabel("Tela de Gerenciamento de Livros");
		lblTituloPag.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblTituloPag);

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		btnCadastrar = new JButton("Cadastrar");
		panel_1.add(btnCadastrar);

		btnConsultar = new JButton("Consultar");
		panel_1.add(btnConsultar);

		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_2, BorderLayout.CENTER);

		JLabel lblISBN = new JLabel("ISBN");
		panel_2.add(lblISBN);

		textFieldISBN = new JTextField();
		panel_2.add(textFieldISBN);
		textFieldISBN.setColumns(10);

		JLabel lbltitulo = new JLabel("Título");
		panel_2.add(lbltitulo);

		textFieldTitulo = new JTextField();
		textFieldTitulo.setColumns(20);
		panel_2.add(textFieldTitulo);

		JLabel lblISBN_1_1 = new JLabel("Autor");
		panel_2.add(lblISBN_1_1);

		textFieldAutor = new JTextField();
		textFieldAutor.setColumns(34);
		panel_2.add(textFieldAutor);
	}

	public JTextField getTextFieldISBN() {
		return textFieldISBN;
	}

	public void setTextFieldISBN(JTextField textFieldISBN) {
		this.textFieldISBN = textFieldISBN;
	}

	public JTextField getTextFieldTitulo() {
		return textFieldTitulo;
	}

	public void setTextFieldTitulo(JTextField textFieldTitulo) {
		this.textFieldTitulo = textFieldTitulo;
	}

	public JTextField getTextFieldAutor() {
		return textFieldAutor;
	}

	public void setTextFieldAutor(JTextField textFieldAutor) {
		this.textFieldAutor = textFieldAutor;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}

	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void limparCampos() {
		textFieldAutor.setText("");
		textFieldISBN.setText("");
		textFieldTitulo.setText("");
	}
}

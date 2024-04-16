package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class JanelaCalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_PrimeiroNum;
	private JTextField textField_SegundoNum;
	private JTextField textFieldResultado;
	private JButton btnDividir;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCalculadora frame = new JanelaCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaCalculadora() {
		setResizable(false);
		setTitle("Atividade Prática I - Yan Braga");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panelNumeros = new JPanel();
		panelNumeros.setBackground(Color.PINK);
		panelNumeros.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		FlowLayout fl_panelNumeros = (FlowLayout) panelNumeros.getLayout();
		fl_panelNumeros.setVgap(30);
		fl_panelNumeros.setAlignment(FlowLayout.LEFT);
		contentPane.add(panelNumeros, BorderLayout.CENTER);

		JLabel lblPrimeiro = new JLabel("Primeiro Número");
		lblPrimeiro.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelNumeros.add(lblPrimeiro);

		textField_PrimeiroNum = new JTextField();
		textField_PrimeiroNum.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelNumeros.add(textField_PrimeiroNum);
		textField_PrimeiroNum.setColumns(10);

		JLabel lblSegundo = new JLabel("Segundo Número");
		lblSegundo.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelNumeros.add(lblSegundo);

		textField_SegundoNum = new JTextField();
		textField_SegundoNum.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_SegundoNum.setColumns(10);
		panelNumeros.add(textField_SegundoNum);

		JPanel panelBotao = new JPanel();
		panelBotao.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelBotao.setBackground(Color.PINK);
		FlowLayout fl_panelBotao = (FlowLayout) panelBotao.getLayout();
		fl_panelBotao.setAlignment(FlowLayout.LEFT);
		contentPane.add(panelBotao, BorderLayout.SOUTH);

		btnDividir = new JButton("Dividir");
		btnDividir.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelBotao.add(btnDividir);

		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelBotao.add(btnLimpar);

		JPanel panelResultado = new JPanel();
		contentPane.add(panelResultado, BorderLayout.NORTH);
		panelResultado.setLayout(new BorderLayout(0, 0));

		textFieldResultado = new JTextField();
		textFieldResultado.setFont(new Font("Tahoma", Font.BOLD, 30));
		panelResultado.add(textFieldResultado);
		textFieldResultado.setColumns(10);
		textFieldResultado.setPreferredSize(new Dimension(600, 70));
	}

	public JTextField getTextField_PrimeiroNum() {
		return textField_PrimeiroNum;
	}

	public void setTextField_PrimeiroNum(JTextField textField_PrimeiroNum) {
		this.textField_PrimeiroNum = textField_PrimeiroNum;
	}

	public JTextField getTextField_SegundoNum() {
		return textField_SegundoNum;
	}

	public void setTextField_SegundoNum(JTextField textField_SegundoNum) {
		this.textField_SegundoNum = textField_SegundoNum;
	}

	public JTextField getTextFieldResultado() {
		return textFieldResultado;
	}

	public void setTextFieldResultado(JTextField textFieldResultado) {
		this.textFieldResultado = textFieldResultado;
	}

	public JButton getBtnDividir() {
		return btnDividir;
	}

	public void setBtnDividir(JButton btnDividir) {
		this.btnDividir = btnDividir;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	public void limpar() {
		textFieldResultado.setText("");
		textField_PrimeiroNum.setText("");
		textField_SegundoNum.setText("");

	}

}

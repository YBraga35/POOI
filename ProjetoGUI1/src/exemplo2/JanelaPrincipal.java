package exemplo2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class JanelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldNome;
	private JLabel labelOpcpes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setTitle("Minha Segunda Aplicação");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelNome.setBounds(23, 28, 54, 14);
		contentPane.add(labelNome);
		
		fieldNome = new JTextField();
		fieldNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fieldNome.setBounds(83, 21, 200, 20);
		contentPane.add(fieldNome);
		fieldNome.setColumns(10);
		
		labelOpcpes = new JLabel("Opções");
		labelOpcpes.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelOpcpes.setBounds(23, 56, 54, 22);
		contentPane.add(labelOpcpes);
		
		JComboBox<String> comboOpcoes = new JComboBox<String>();
		comboOpcoes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboOpcoes.addItem("");
		comboOpcoes.addItem("Item 1");
		comboOpcoes.addItem("Item 2");
		comboOpcoes.addItem("Item 3");
		comboOpcoes.setBounds(83, 52, 101, 22);
		contentPane.add(comboOpcoes);
		
		JCheckBox checkDoador = new JCheckBox("Doador");
		checkDoador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkDoador.setBounds(190, 48, 97, 30);
		contentPane.add(checkDoador);
		
		JLabel labelEscreva = new JLabel("Escreva aqui:");
		labelEscreva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelEscreva.setBounds(23, 116, 136, 22);
		contentPane.add(labelEscreva);
		
		JTextArea textEscreva = new JTextArea();
		textEscreva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textEscreva.setBounds(23, 149, 374, 88);
		contentPane.add(textEscreva);
		
		ButtonGroup grupo = new ButtonGroup();
		
		JButton buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonCadastrar.setBounds(23, 262, 101, 23);
		contentPane.add(buttonCadastrar);
		
		JButton buttonSair = new JButton("Sair");
		buttonSair.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonSair.setBounds(134, 262, 101, 23);
		contentPane.add(buttonSair);
		
		JRadioButton radioMasc = new JRadioButton("Masculino");
		radioMasc.setFont(new Font("Tahoma", Font.BOLD, 14));
		radioMasc.setBounds(299, 19, 109, 23);
		contentPane.add(radioMasc);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnFeminino.setBounds(299, 52, 109, 23);
		contentPane.add(rdbtnFeminino);
		
		grupo.add(rdbtnFeminino);
		grupo.add(radioMasc);
	}
}

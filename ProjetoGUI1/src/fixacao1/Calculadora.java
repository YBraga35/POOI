package fixacao1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Dimension;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);
		panel1.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(7, 35));
		panel1.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton[] vetBotoes = new JButton[16];
			vetBotoes[0] = new JButton("1");
			vetBotoes[1] = new JButton("2");
			vetBotoes[2] = new JButton("3");
			vetBotoes[3] = new JButton("+");
			vetBotoes[4] = new JButton("4");
			vetBotoes[5] = new JButton("5");
			vetBotoes[6] = new JButton("6");
			vetBotoes[7] = new JButton("-");
			vetBotoes[8] = new JButton("7");
			vetBotoes[9] = new JButton("8");
			vetBotoes[10] = new JButton("9");
			vetBotoes[11] = new JButton("/");
			vetBotoes[12] = new JButton("0");
			vetBotoes[13] = new JButton("^");
			vetBotoes[14] = new JButton("C");
			vetBotoes[15] = new JButton("CE");
			
		for (int j = 0; j < vetBotoes.length; j++) {
			panel2.add(vetBotoes[j]);
		}

		
		JPanel panel3 = new JPanel();
		contentPane.add(panel3, BorderLayout.SOUTH);
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		
		JButton buttonCalcular = new JButton("Calcular");
		panel3.add(buttonCalcular);
	}

}

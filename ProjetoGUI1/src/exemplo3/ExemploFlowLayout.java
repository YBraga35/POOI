package exemplo3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExemploFlowLayout extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldNome;
	private JTextField fieldEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploFlowLayout frame = new ExemploFlowLayout();
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
	public ExemploFlowLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel labelNome = new JLabel("Nome");
		contentPane.add(labelNome);
		
		fieldNome = new JTextField();
		fieldNome.setText("");
		contentPane.add(fieldNome);
		fieldNome.setColumns(10);
		
		JLabel labelEndereco = new JLabel("Endereço");
		contentPane.add(labelEndereco);
		
		fieldEndereco = new JTextField();
		fieldEndereco.setText("");
		contentPane.add(fieldEndereco);
		fieldEndereco.setColumns(10);
	}

}

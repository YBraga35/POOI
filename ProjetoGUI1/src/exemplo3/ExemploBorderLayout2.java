package exemplo3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class ExemploBorderLayout2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploBorderLayout2 frame = new ExemploBorderLayout2();
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
	public ExemploBorderLayout2() {
		setTitle("Exemplo Border Layout 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSul = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelSul.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panelSul, BorderLayout.SOUTH);
		
		JButton buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.setHorizontalAlignment(SwingConstants.LEFT);
		panelSul.add(buttonCadastrar);
		
		JButton buttonSair = new JButton("Sair");
		panelSul.add(buttonSair);
		
		JPanel panelCentro = new JPanel();
		contentPane.add(panelCentro, BorderLayout.CENTER);
	}

}

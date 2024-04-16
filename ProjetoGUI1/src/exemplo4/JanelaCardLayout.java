package exemplo4;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import java.awt.Color;

public class JanelaCardLayout extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout card;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//UIManager.setLookAndFeel("javax.swing.plaf.numbus.NimbusLookAndFeel");
					JanelaCardLayout frame = new JanelaCardLayout();
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
	public JanelaCardLayout() {
		setTitle("Exemplo Card Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuExibir = new JMenu("Exibir");
		menuBar.add(menuExibir);
		
		JMenuItem itemTela1 = new JMenuItem("Tela 1");
		menuExibir.add(itemTela1);
		
		JMenuItem itemTela2 = new JMenuItem("Tela 2");
		menuExibir.add(itemTela2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		card = (CardLayout) contentPane.getLayout();
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel2, "t2");
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.PINK);
		contentPane.add(panel1, "t1");
	}
	

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Tela 1")) {
			card.show(contentPane,"t1");
		}
		else if(e.getActionCommand().equals("Tela 2")) {
			card.show(contentPane,"t2");
		}
	}
	

}

package exemplo1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestaContainer {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		janela.setTitle("Minha Primeira Janela");
		janela.setBounds(0, 0, 600, 300);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton botao = new JButton("Aperte-me");
		janela.getContentPane().add(botao);
		janela.setVisible(true);
	}
	
}

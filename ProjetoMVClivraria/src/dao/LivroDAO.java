package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Livro;

public class LivroDAO {

	private File arq;
	private FileReader fr;
	private BufferedReader br;

	public LivroDAO() {
		arq = new File("livros.txt");
	}

	public boolean cadastraLivro(Livro li) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(arq, true);
			bw = new BufferedWriter(fw);

			bw.write(li.toString());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			try {
				fw.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return true;
	}

	public boolean consultaLivro(Livro li) {
		boolean resp = false;
		try {
			fr = new FileReader(arq);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Arquivo inexistente!");
		} catch (IOException e) {
			System.out.println("Erro na manipulação de arquivo!");
		}

		String linha = null;
		String[] campos = new String[3];

		try {
			while ((linha = br.readLine()) != null) {
				campos = linha.split("#");
				if (campos[0].equals(li.getIsbn())) {
					li.setTitulo(campos[1]);
					li.setAutor(campos[2]);
					resp = true;
					break;
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resp;

	}

	public File getArq() {
		return arq;
	}

	public void setArq(File arq) {
		this.arq = arq;
	}

	public FileReader getFr() {
		return fr;
	}

	public void setFr(FileReader fr) {
		this.fr = fr;
	}

	public BufferedReader getBr() {
		return br;
	}

	public void setBr(BufferedReader br) {
		this.br = br;
	}

}

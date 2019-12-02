package fachada;

import java.io.File;
import java.util.ArrayList;

public class ArrayPessoa {
	private ArrayList<Pessoa> pessoas;


	public ArrayPessoa() {

		this.pessoas = new ArrayList <Pessoa>();
	}

	public void addPessoa (Pessoa p) {
		this.pessoas.add(p);

	}
	
	public void RecuperarPessoa(File f) {
		
	}

	public String getNomePessoa(int indice) {
		return pessoas.get(indice).getNome();

	}

	public String getTelefonePessoa(int indice) {

		return pessoas.get(indice).getTelefone();


	}

	public String getRgPessoa(int indice) {
		return pessoas.get(indice).getRg();


	}


	public void imprimir (){

		for (int i = 0; i < this.pessoas.size(); i++) {
			System.out.println(this.pessoas.get(i));

		}
	}

}

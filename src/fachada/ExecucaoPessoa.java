package fachada;

public class ExecucaoPessoa {

	public static void main(String[] args) {
		
		ArrayPessoa pessoa = new ArrayPessoa();
		Pessoa p = new Pessoa("hiago", "87167388", "8555412");
		Pessoa q = new Pessoa("hiago", "87167388", "8555412");
		Pessoa r = new Pessoa("hiago", "87167388", "8555412");
		
		pessoa.addPessoa(p);
		pessoa.addPessoa(q);
		pessoa.addPessoa(r);
		
		System.out.println(pessoa.getRgPessoa(1));
		
        }
 	}



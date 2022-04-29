package ArquivosPacote;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arquivosJava { 

	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("Leooooo siqueira");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(30);
		pessoa2.setNome("juliaaaaaa rufler");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(12);
		pessoa3.setNome("marceli pprt");
		
		/*Pode vir de um Banco de dados ou qualquer Fonte de Dados; */
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);  
		pessoas.add(pessoa3);
		
		File arquivo = new File("C:\\Users\\Leona\\git\\repository1\\Arquivos\\src\\ArquivosPacote\\arquivo.csv");
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		} 
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome()+ ";" + p.getEmail() +";"+ p.getIdade()+ "\n");
			
 
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}

}

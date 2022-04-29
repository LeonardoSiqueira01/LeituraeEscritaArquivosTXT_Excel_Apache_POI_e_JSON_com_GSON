package ArquivosPacote;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Leona\\git\\repository1\\Arquivos\\src\\ArquivosPacote\\arquivo_EXCEL.xls");
		if(!file.exists()) {
			file.createNewFile();
			

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
			
    
			Pessoa pessoa4 = new Pessoa();
			pessoa4.setEmail("pessoa4@gmail.com");
			pessoa4.setIdade(122);
			pessoa4.setNome("lucas pprt");
			
			/*Pode vir de um Banco de dados ou qualquer Fonte de Dados; */
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			pessoas.add(pessoa1); 
			pessoas.add(pessoa2);
			pessoas.add(pessoa3);
			pessoas.add(pessoa4);
			
			HSSFWorkbook  hssfWorkbook = new HSSFWorkbook(); /*Vai ser usado para escrever a planilha*/
			HSSFSheet linhaPessoa = hssfWorkbook.createSheet("Planilha de pessaos Jdev Treinamento");/*Criar a planilha */
			
			int numeroLinha =0;
			for (Pessoa p : pessoas) {
				Row linha = linhaPessoa.createRow(numeroLinha ++); /*Criando a linha na planilha*/
				
				int celula = 0;
				
				Cell celNome = linha.createCell(celula ++); /*Celula 1 */
				celNome.setCellValue(p.getNome());
			
				Cell celEmail = linha.createCell(celula ++); /*Celula 2 */
				celEmail.setCellValue(p.getEmail());
				
				Cell celIdade = linha.createCell(celula ++); /*Celula 3 */
				celIdade.setCellValue(p.getIdade());
			} /*Terminou de montar a planilha*/
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida); /*Escreve a planilha em arquivo*/
		saida.flush();
		saida.close();
		
		System.out.println("Planilha foi criada");
		}
	}
	
}

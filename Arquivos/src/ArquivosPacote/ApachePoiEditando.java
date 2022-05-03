package ArquivosPacote;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Leona\\git\\repository1\\Arquivos\\src\\ArquivosPacote\\arquivo_EXCEL.xls");
	 FileInputStream entrada = new FileInputStream(file);
	 HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); /*Prepara a entrada de arquivo xsl excel*/
	HSSFSheet planilha = hssfWorkbook.getSheetAt(0); /*Pegando a planilha*/
	
	Iterator<Row> linhaIterator = planilha.iterator();
	
	while(linhaIterator.hasNext()) { /*Enquanto tiver linha*/
		Row linha = linhaIterator.next(); /*Dados da pessoa na linha*/
		
		int numeroCelulas = linha.getPhysicalNumberOfCells();
		
		Cell cell = linha.createCell(numeroCelulas); /*Cria nova celula na linha*/
		cell.setCellValue("5487,20");
	}
	entrada.close();
	 FileOutputStream saida = new FileOutputStream(file);
	 hssfWorkbook.write(saida);
	 saida.flush();
	 saida.close();
	 System.out.println("Planilha atualizada");
	}
}

package ArquivosPacote;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("213313121");
		usuario1.setLogin("Leonardo G");
		usuario1.setSenha("12345");
		usuario1.setNome("leoG");
		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("32312");
		usuario2.setLogin("daniel Maçã G");
		usuario2.setSenha("123245");
		usuario2.setNome("DSG");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String JsonUser =  gson.toJson(usuarios);
		System.out.println(JsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\Leona\\git\\repository1\\Arquivos\\src\\ArquivosPacote\\filejson.json");
		

		fileWriter.write(JsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		//*--------------------------- LENDO O ARQUIVO JSON -----------------------*//
		FileReader fileReader = new FileReader("C:\\Users\\Leona\\git\\repository1\\Arquivos\\src\\ArquivosPacote\\filejson.json");
	
	JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
	List<Usuario> liUsuarios = new ArrayList<Usuario>();
	for (JsonElement jsonElement : jsonArray) {
		Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
		liUsuarios.add(usuario);
	}
	System.out.println("Leitura do arquivo JSON: "+liUsuarios);
	
	}
}

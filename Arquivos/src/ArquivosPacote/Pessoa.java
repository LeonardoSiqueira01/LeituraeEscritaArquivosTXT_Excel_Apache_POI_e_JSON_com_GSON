package ArquivosPacote;

public class Pessoa {

private String nome;
private String Email;
private int idade;

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}  
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	this.Email = email;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
@Override
public String toString() {
	return "Pessoa [nome=" + nome + ", email=" + Email + ", idade=" + idade + "]";
}


}

package Project;

public class Pessoa {
	private String nome;
	private int idade;
	private String cpf;
	
	//construtor: inicializa os atributos
	public Pessoa(String nome, int idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	// getters e setters: permitem ler e 
	// alterar atributos de forma controlada
	public String getNome() {return nome; }
	public void setNome(String nome) { this.nome = nome;}
	
	public int getIdade() {return idade; }
	public void setIdade(int idade) { this.idade = idade;}
	
	public String getCpf() {return cpf; }
	public void setCpf(String cpf) { this.cpf = cpf;}
	
	// toString: representação texto da pessoa
	// (útil para exibir no console)
	@Override
	public String toString() {
		return String.format("%s (idade: %d, CPF: %s)", nome, idade, cpf);		
	}
	
}

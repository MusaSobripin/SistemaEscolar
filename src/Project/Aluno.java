package Project;

public class Aluno extends Pessoa{
	private String matricula;
	
	//construtor: chama o construtor da superclasse
	// (Pessoa) com o 'super(...)'
	public Aluno(String nome, int idade, String cpf, String matricula) {
		super(nome, idade, cpf);
		this.matricula = matricula;
	}
	
	// getter e setter da matrícula
	public String getMatricula() {return matricula; }
	public void setMatricula(String matricula) { this.matricula = matricula;}

	
	 
}

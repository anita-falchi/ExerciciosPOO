//Crie uma classe paciente e apresente os atributos e métodos referentes esta classe,
//em seguida crie um objeto paciente, defina as instancias deste objeto
//e apresente as informações deste objeto no console.

package POO;

public class PacienteClasse {
	//atributos
	private String nome;
	private String medico;
	
	
	//metodo construtor
	public PacienteClasse(String nome, String medico)
	{
		this.nome = nome;
		this.medico = medico;
	
	}
	
	//metodo
	
	public void infoPaciente ()
	{
		System.out.println("Paciente: " + this.nome);
		System.out.println("Atendido por: " + this.medico);
	}
	
	

}

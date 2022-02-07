//Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe,
//em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as 
//informações deste objeto no console.

package POO;

public class FuncionarioClasse {
	
	//atributos
	private String nome;
	private String sobrenome;
	private int x;
	
//construtor
	
	public FuncionarioClasse (String nome, String sobrenome, int idade) //parametros
	{
		this.nome=nome;
		this.sobrenome=sobrenome;
		this.x=idade;  
	}
	
	//metodo que pega os atributos e associa aos parametros e retorna
		public String infoFuncionario()
		{
			String infoFuncionario = nome+" "+sobrenome+" "+x;
			return infoFuncionario;
			
		}
	
	
}



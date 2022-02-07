//Crie uma classe cliente e apresente os atributos e métodos 
//referentes esta classe, em seguida crie um objeto cliente,
//defina as instancias deste objeto e apresente as informações 
//deste objeto no console


/*
para definir um objeto deve conter: 
caracteristicas = atributos.
comportamento = métodos (ações , funções do seu objeto).
estado = como o objeto está, situação em que se encontra.
this -> faz referencias a atributos dentro da mesma classe.
*/

package POO;


public class ClienteClasse {
	
	//ATRIBUTOS (variaveis do seu objeto onde irá fazer as definições.)
	String nome;
	int idade;
	boolean ativo;
	
	//METODOS (executa uma ação do seu objeto.)
	
	
	
	public void status()
	{
		
		System.out.println("Nome: "+this.nome);
		System.out.println("Sua idade é: "+this.idade);
		System.out.println("O cliente esta ativo?");
		if(this.ativo==true)
		System.out.println("Sim está ativo");
			else	
		System.out.println("Não está ativo");
	}
}
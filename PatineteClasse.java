//Crie uma classe patinete e apresente os atributos e métodos referentes esta classe,
//em seguida crie um objeto patinete, defina as instancias deste objeto e 
//apresente as informações deste objeto no console.

package POO;

public class PatineteClasse {
	
	//atributos
		String cor;
		String tamanho;
		
		//método construtivo
		public PatineteClasse (String cor, String tamanho)
		{
		this.cor=cor;
		this.tamanho=tamanho;
		}
		
		//método void ()
		public void tipoPatinete()
		{
			System.out.println("A cor do patinete é: " +this.cor);
			System.out.println("O tamanho do patinete: " +this.tamanho);
		}

	
	
}

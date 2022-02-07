//Crie uma classe produto eletrônico e apresente os atributos e métodos
//referentes esta classe, em seguida crie um objeto produto eletrônico, 
//defina as instancias deste objeto e apresente as informações deste objeto no console.

package POO;

public class EletronicoClasse {
	
	//atributos
	
	private String tipo; 
	private String modelo;
	private int p;
	
	
	//construtor
	
	public EletronicoClasse (String tipo, String modelo, int peso) //parametros
	{ //atributos = parametros
		this.tipo=tipo;
		this.modelo=modelo;
		this.p=peso;
			
	}
	

	//metodo que pega os atributos e associa aos parametros e retorna
	public String getEletronico()
	{
		String Eletronico = this.tipo+" "+this.modelo+" "+this.p;
		return Eletronico;
		
	}
	
	
	
	
}



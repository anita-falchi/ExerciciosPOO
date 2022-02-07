
package POO;

public class Pessoa {
	//atributos
	private String primeiroNome; 
	private String ultimoNome; 
	private String nomesDoMeio;
	
	//construtor
	public Pessoa (String primeiro, String meio, String ultimo) //parametros
	{
		primeiroNome=primeiro;
		ultimoNome=ultimo;
		nomesDoMeio=meio;  
	}
	
	
	//metodo que pega os atributos e associa aos parametros e retorna
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
		
	}
	
	
	
	
}


















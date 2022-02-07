//Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe,
//em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente 
//as informações deste objeto no console.

package POO;

public class ContaClasse {
//atributos
	
	String nomeCliente;
	String tipoConta;
	String banco;
	double saldo;
	
	
//construtor
	
	public ContaClasse (String cliente, String conta, String banco, double saldo)
	{
	this.nomeCliente=cliente;
	this.tipoConta=conta;
	this.banco=banco;
	this.saldo=saldo;
	}
	
//metodo
	
	public void infoConta() 
	{
	System.out.println("Cliente:" + nomeCliente);
	System.out.println("Conta: " + tipoConta);
	System.out.println("Banco:" + banco);
	System.out.println(70000);
	}
}

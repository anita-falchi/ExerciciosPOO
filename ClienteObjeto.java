package POO;

public class ClienteObjeto {

	public static void main(String[] args) {
		ClienteClasse cliente = new ClienteClasse (); //como estanciar > criar objeto
		
		cliente.nome="Anita";
		cliente.ativo=true;
		cliente.idade=29;

		cliente.status();
	}

}

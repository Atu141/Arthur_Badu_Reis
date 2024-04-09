package exemplo2;

public class Ex2 {
	
	public static void main(String[] args) {
		
		NoLista lista = new NoLista();
		lista.dado = 1;
		lista.prox = null;
		System.out.println("Lista :"+ lista);
		System.out.println("Lista :"+ lista.dado);
		System.out.println("Lista :"+ lista.prox);

		NoLista novo = new NoLista();
		novo.dado = 2;
		novo.prox = null;
		
		lista.prox = novo;
		
		System.out.println("\n\n Depois da inserção 2° nó");
		System.out.println("Lista :"+ lista);
		System.out.println(" Lista :"+ lista.dado);
		System.out.println(" Lista :"+ lista.prox);
		System.out.println("\n novo :"+ novo);
		System.out.println(" novo :"+ novo.dado);
		System.out.println(" novo :"+ novo.prox);
	}

}

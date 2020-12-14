package listaEncandeada;

public class TesteListaEncandeada {
	public static void main(String[] args) {
		RemovePares<Integer> lista = new RemovePares<Integer>();
	
		lista.adicionaMeio(6, 1);
		lista.imprime();
		lista.adicionaMeio(7, 1);
		lista.imprime();
		lista.adicionaMeio(8, 1);
		lista.imprime();
		lista.adicionaMeio(9, 1);
		lista.imprime();
		lista.adicionaMeio(1, 1);
		lista.imprime();
		lista.adicionaMeio(2, 1);
		lista.imprime();
		lista.adicionaMeio(3, 1);
		lista.imprime();
		lista.adicionaMeio(4, 1);
		lista.imprime();
		lista.adicionaMeio(5, 1);
		lista.imprime();
		lista.adicionaMeio(8, 1);
		lista.imprime();
		lista.adicionaMeio(8, 1);
		lista.imprime();
	
		
		lista.removePares(lista);
		lista.imprime();
		
		
	}

}

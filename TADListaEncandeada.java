package listaEncandeada;

/**
 * TAD (Tipo Abstrato de Dados)
 * 
 * @author henrique
 * 
 * @since 11/12/2020
 * 
 * @version 2.0
 *
 */

interface TADListaEncandeada<T> {
	 //Métodos principais:
	public void adicionaInicio(T valor);
	public void adicionaFinal(T valor);
	public void adicionaMeio(T valor, int indice);
	public T removeInicio();
	public T removeFinal();
	public T removeMeio(int indice);
	
	//Métodos auxiliares:
	public boolean listaVazia();
	public void imprime();

}

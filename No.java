package listaEncandeada;

public class No<T> {
	private T valor;
	private No proximo;
	
	public No(T valor, No proximo){
		this.valor = valor;
		this.proximo = proximo;
	}
	
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	public No<T> getProximo(){
		return proximo;
	}
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

}

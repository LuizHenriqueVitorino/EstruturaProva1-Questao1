package listaEncandeada;

public class ListaEncandeada<T> implements TADListaEncandeada<T>{
	
	public No<T> cabeca;
	public int tamanho = 0;
	
	public void adicionaInicio(T valor) {
		No<T> auxiliar = cabeca;
		No<T> novoNo = new No<T>(valor, auxiliar);
		cabeca = novoNo;
		tamanho++;
		
	}

	public void adicionaFinal(T valor) {
		No<T> novoNo = new No<T>(valor, null);
		
		if(listaVazia()) {
			adicionaInicio(valor);
			return;
		}
		No<T> auxiliar = cabeca;
		while(auxiliar.getProximo() != null) {
			auxiliar = auxiliar.getProximo();
		}
		auxiliar.setProximo(novoNo);
		
		tamanho++;
		
	}

	public void adicionaMeio(T valor, int indice) {
		if(indice > tamanho + 1) {
			System.out.println("Indice inválido. O tamanho da lista é :"+tamanho);
			return;
		}
		if(indice == tamanho + 1) {
			adicionaFinal(valor);
			return;
		}
		if(indice == 1) {
			adicionaInicio(valor);
			return;
		}
		if(indice < 1) {
			System.out.println("Índice menor que 1? Sério mesmo? Meu Deus!!!!");
			return;
		}
		int indiceAuxiliar = 1;
		No<T> auxiliar = cabeca;
		
		while(indiceAuxiliar != indice - 1) {
			auxiliar = auxiliar.getProximo();
			indiceAuxiliar++;
			
		}
		No<T> novoNo = new No<T>(valor, auxiliar.getProximo());
		auxiliar.setProximo(novoNo);
		
		tamanho++;
	}

	public T removeInicio() {
		if(listaVazia()) {
			System.out.println("Lista vazia. Não há elementos para remoção");
			return null;
		}
		
		No<T> noRemovido = cabeca;
		cabeca = cabeca.getProximo();
		noRemovido.setProximo(null);
		tamanho--;
		
		return noRemovido.getValor();
	}

	public T removeFinal() {
		if(listaVazia()) {
			System.out.println("Lista vazia. Não há elementos para remoção");
			return null;
		}
		if(tamanho == 1) {
			cabeca = null;
			tamanho--;
			return null;
		}
		No<T> auxiliar = cabeca;
		while(auxiliar.getProximo().getProximo() != null) {
			auxiliar = auxiliar.getProximo();
		}
		No<T> noRemovido = auxiliar.getProximo();
		auxiliar.setProximo(null);
		
		tamanho--;
		return noRemovido.getValor();
	}

	public T removeMeio(int indice) {
		if(listaVazia()) {
			System.out.println("Lista vazia. Não há elementos para remoção");
			return null;
		}
		if(indice > tamanho) {
			System.out.println("Índice inválido. O tamanho da lista é: "+tamanho);
			return null;
		}
		if(indice <=0) {
			System.out.println("Indice menor que 1?? Presta atenção cara....");
			return null;
		}
		if(indice == 1 & tamanho==1) {
			removeInicio();
			return null;
		}
		if(indice == 1) {
			removeInicio();
			return cabeca.getValor();
		}
		
		int indiceAuxiliar = 1;
		No<T> auxiliar = cabeca;
		
		while(indiceAuxiliar < indice -1) {
			auxiliar = auxiliar.getProximo();
			indiceAuxiliar++;
		}
		
		No<T> noRemovido = auxiliar.getProximo();
		auxiliar.setProximo(auxiliar.getProximo().getProximo());
		noRemovido.setProximo(null);
		tamanho--;
		
		return noRemovido.getValor();
	}

	public boolean listaVazia() {
		return cabeca == null ? true : false;
	}

	public void imprime() {
		if(listaVazia()) {
			System.out.println("Lista vazia. Não há elementos para imprimir.");
			return;
		}
		No<T> auxiliar = cabeca;
		while(auxiliar != null) {
			System.out.print(" => "+auxiliar.getValor());
			auxiliar = auxiliar.getProximo();
		}
		System.out.println();
		
	}

}

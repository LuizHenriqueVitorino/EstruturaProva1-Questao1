package listaEncandeada;

/**
 * AP1 - Estrutura de Dados - Questão 1
 *
 * Para esta questão, criei toda a estrutura da Lista Encandeada
 * E coloquei este método na Classe apenas para destaca-la. 
 *
 * No formulário só se pode adicionar um arquivo, então doloqueo o projeto
 * no github (https://github.com/LuizHenriqueVitorino/EstruturaProva1-Questao1.git)
 * 
 * @author Luiz Henrique da Silva Vitorino (luiz.henrique.silva60@aluno.ifce.edu.br)
 * 
 * @since 14/12/2020
 * 
 * @version 1.0
 *
 */

public class RemovePares<T> extends ListaEncandeada<T> {
	//Esta classe só possui um método para destacar a questão da prova
	//de Etrutura de Dados.
	
	public void removePares(TADListaEncandeada<Integer> lista){
		//No auxiliar para percorrer a lista e verificar se o valor é par.
		No<Integer> auxiliar = (No<Integer>) cabeca;
		
		//este índise serve como controle, pois no método da clase ListaEncandeada
		//precisamos indicar o índice da classe que precisamos remover.
		int indice = 1;
		
		while(auxiliar != null) {
			if(auxiliar.getValor()%2 == 0) {
				auxiliar = auxiliar.getProximo();
				lista.removeMeio(indice);
				continue;
			}
			auxiliar = auxiliar.getProximo();
			indice++;
		}
	}
	
}

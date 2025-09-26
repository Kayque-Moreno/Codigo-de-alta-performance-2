package application;

import application.lista.ListaSimples;
import application.pilha.PilhaSimples;

public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.adicionar("Primeiro ");
        lista.adicionar("Segundo ");
        lista.adicionar("Terceiro");

        lista.remover(1);

        System.out.println(lista);

        System.out.println("PILHA");
        PilhaSimples pilha = new PilhaSimples (4);
        pilha.empilhar("Primeiro");
        pilha.empilhar("Segundo");
        pilha.empilhar("Terceiro");
        pilha.empilhar("Quarto");

        System.out.println(pilha.desempilhar());

        System.out.println(pilha);
    }
}

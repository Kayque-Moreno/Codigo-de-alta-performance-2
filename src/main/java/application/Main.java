package application;

import application.lista.ListaSimples;

public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.adicionar("Primeiro ");
        lista.adicionar("Segundo ");
        lista.adicionar("Terceiro");

        lista.remover(1);

        System.out.println(lista);
    }
}


package application.pilha;

public class PilhaSimples {
    private String[] itens;
    private int tamanho;
    private int topo;

    //criação de um MÉTODO CONSTRUTOR//
    public PilhaSimples(int tamanho){
        this.tamanho = tamanho;
        this.itens = new String[this.tamanho];
        this.topo = -1;
    }

    //criação do método EMPILHAR// 
    public void empilhar(String valor){
        if (topo == (tamanho - 1)){
            System.out.println("Pilha Cheia!!!");
        } else{
            //topo++;
            //itens[topo] = valor;
            itens[++topo] = valor;
        }
    }

    public String desempilhar(){
        String resultado = "";
        if (topo == -1){
            System.out.println("A pilha já está vazia!");
        } else{
            resultado = itens[topo--];
        }
        return resultado;
    }

    @Override
    public String toString(){
        String resultado = "";
        if (topo >= 0){
            for (int cont = 0; cont <= topo; cont++){
                resultado += itens[cont] + "  ";
            }
        }
        return resultado;
    }   
}

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    /* Contador de nós da lista para não percorrela toda*/
    private int tamanho = 0;


    /*Instanciar no pelo Inicio */
    public void adiciona (T elemento) {
        No<T> celula = new No<T>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;        
        this.tamanho++;
    }


    /*Metodo que limpa a lista*/
    public void limpa() {
        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }


    /*Metodo que retorna o tamanho da lista */
    public int getTamanho() {
        return this.tamanho;
    };

    /*Facilitar impressão da lista */
    @Override
    public String toString() {

        // [1, 2, 3, 4]

        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");


        No<T> atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");


        return builder.toString();
    }
}

    

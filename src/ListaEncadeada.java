public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    /* Contador de nós da lista para não percorrela toda*/
    private int tamanho = 0;

    private final int NAO_ENCONTRADO = -1;
    private final String NAO_EXISTE = "Posição não existe.";
    private final String LISTA_VAZIA = "Lista está vazia.";
    private static final int MENOR = -1;
    private static final int IGUAL_MAIOR = 0;

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
            /*Linha 26 pega o atual e atualiza */
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    /* Metodo que busca a posição do no inteiro */
    private No<T> buscaNo(int posicao) {
        /*à "!" exclamação serve para verifiar se NÃO existe. e lança uma Exeção */
        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }
        /*Movimenta apenas o ponteiro */
        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }
        return noAtual;
    }

    /* Metodo para buscar por Elemento ou Posição na Lista */
    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    /*Metodo para pesquisar se elemento existe na lista */
    public int busca(T elemnto){
        /*compara se o elemento é o que prucuraos */
        No<T> noAtual = this.inicio;
        int pos = 0;

        while (noAtual != null) {

            if (noAtual.getElemento().equals(elemnto)) {
                return pos;
            }
            pos++;
            noAtual = noAtual.getProximo();
        }

        return NAO_ENCONTRADO;
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

    

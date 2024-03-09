public class ListaEncadeada<T> {

    private No<T> inicio;
    /* Contador de nós da lista para não percorrela toda*/
    private int tamanho = 0;


    /*Instanciar no */
    public void adiciona (T elemento) {
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
        this.tamanho++;
    }

    /*Metodo que retorna o tamanho da lista */
    public int getTamanho() {
        return this.tamanho;
    };

    /*Facilitar impressão da lista */
    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

    
}

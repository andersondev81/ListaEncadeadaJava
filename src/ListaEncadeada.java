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

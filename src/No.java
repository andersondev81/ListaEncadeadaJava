

public class No<T> {
    private T elemento;
    private No<T> proximo;
    
    /*Construtors */
    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    
    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }


    /*Gets e Sets */
    public T getElemento() {
        return elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    private No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo){
        this.proximo = proximo;
    }

    /*Facilitar a impressão */
    @Override
    public String toString() {
        return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
    }
    

}

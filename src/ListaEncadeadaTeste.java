public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.err.println("Tamanho da lista = " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);
        
    }

    
}

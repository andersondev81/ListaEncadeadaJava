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

        //lista.limpa();
       // System.out.println(lista);

        //Busca por elemento
        System.out.println("--- Busca por elemento ---");
        System.out.println(lista.busca(1));
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));
        System.out.println(lista.busca(0));

        // Busca por posição
        System.out.println("--- Busca por Posição ---");
        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));

    }

    
}

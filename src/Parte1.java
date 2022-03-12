import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parte1 {

    public static void main(String args[]) {
        ListaOrdemAscendente();
    }

    private static void ListaOrdemAscendente() {
        System.out.println("****** ListaOrdemAscendente ******");
        List<String> lista = new ArrayList<String>();
        lista.add("Maria Paula");
        lista.add("Pedro Paulo");
        lista.add("Fernando Fernandes");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
package exemplos;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {
    static void main() {
        List<String> lista = new ArrayList<>();
        lista.add("Selmini");
        lista.add("Antonio");
        lista.add("Carlos");
        lista.add("Ana");

        List<String> lista2 = lista.stream()
                .filter(nome -> nome.startsWith("A") || nome.startsWith("a"))
                .sorted()
                .toList();

        lista2.forEach(nome -> System.out.println(nome));
    }
}

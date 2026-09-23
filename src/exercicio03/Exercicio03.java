package exercicio03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio03 {
    static void main() {
        List<Produto> lista = Arrays.asList(
          new Produto("Notebook", 15000, "Eletrônico"),
          new Produto("Arroz", 29, "Alimentação"),
          new Produto("Mouse", 850, "Eletrônico")
        );

        /*List<String> aux = lista.stream()
                .filter(p -> {
                    p.categoria().equalsIgnoreCase("eletrônico") && p.preco() > 1000

                })
                .map(p -> {
                    String.format("%s - Preço com desconto R$ %.2f", p.nome(), p.preco() * 0.9);
                })
                .forEach(System.out::println);*/
    }
}

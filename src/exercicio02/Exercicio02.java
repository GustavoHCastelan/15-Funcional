package exercicio02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercicio02 {
    static void main() {
        List<Empregado> lista = Arrays.asList(
                new Empregado("C", 100, 10),
                new Empregado("A", 1000, 3),
                new Empregado("B", 10000, 23)
        );

        List<Empregado> reajustados = lista.stream()
                .map(emp -> {
                    double salarioNovo;
                    if (emp.anosExperiencia() >= 5){
                        salarioNovo = emp.salarioAtual() * 1.2;
                    } else {
                        salarioNovo = emp.salarioAtual() * 1.1;
                    }
                    return new Empregado(emp.nome(), salarioNovo, emp.anosExperiencia());
                })
                .sorted(Comparator.comparing(Empregado::nome))
                .toList();

        reajustados.forEach(System.out::println);
    }
}

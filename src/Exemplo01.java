import java.util.Arrays;
import java.util.List;

public class Exemplo01 {
    static void main() {
        Integer[] x = {10,20,1,2,3};
        List<Integer> lista = Arrays.asList(x);

        List<Integer> par = lista.stream()
                .filter(v -> v % 2 == 0)
                .map(v -> v * 2)
                .sorted()
                .toList();

        System.out.println(par);

    }
}

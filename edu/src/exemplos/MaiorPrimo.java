package exemplos;
import java.util.*;

public class MaiorPrimo {
    // Desafio 14 - Encontre o maior número primo da lista:
    // Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(n -> n == 2 || n == 3 || n==5 || (n > 2 && n % 2 != 0 && n % 3 != 0 && n % 5 != 0))
                .max(Comparator.naturalOrder());

        maiorPrimo.ifPresentOrElse(
                n -> System.out.println("O maior número primo é: " + n),
                () -> System.out.println("Não há números primos na lista.")
        );
    }
}

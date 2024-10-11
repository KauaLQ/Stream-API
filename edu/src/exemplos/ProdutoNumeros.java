package exemplos;
import java.util.*;

public class ProdutoNumeros {
    // Desafio 12 - Encontre o produto de todos os números da lista:
    // Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produto = numeros.stream()
                .reduce(1, (n1, n2) -> n1 * n2);

        System.out.println("O produto de todos os números é: " + produto);
    }
}

package exemplos;

import java.util.*;

public class SomaPares {
    // Desafio 2 - Imprima a soma dos números pares da lista:
    // Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
        System.out.println("A soma dos números pares da lista é: " + somaPares);
    }
}

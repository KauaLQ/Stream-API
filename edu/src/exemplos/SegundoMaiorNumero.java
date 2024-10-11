package exemplos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoMaiorNumero {
    // Desafio 7 - Encontrar o segundo número maior da lista:
    // Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        segundoMaior.ifPresent(n -> System.out.println("O segundo maior número é: " + n));

        // Obs.: O método ifPresent() é usado para lidar com objetos da classe Optional em Java.
        // Quando você trabalha com a classe Optional, ela pode ou não conter um valor.
        // O método ifPresent() executa uma ação (como um System.out.println() ou outra operação) apenas
        // se o valor estiver presente, evitando assim o risco de NullPointerException.
    }
}

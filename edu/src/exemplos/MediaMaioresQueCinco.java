package exemplos;
import java.util.*;
public class MediaMaioresQueCinco {
    // Desafio 5 - Calcule a média dos números maiores que 5:
    // Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(n -> n)
                .sum();

        long quantidade = numeros.stream()
                .filter(n -> n > 5)
                .count();

        int media = (int) (soma/quantidade);

        System.out.println(soma + "/" + quantidade + " = " + media);
    }
}

package exemplos;
import java.util.*;

public class VerificaPositivos {
    // Desafio 3 - Verifique se todos os números da lista são positivos:
    // Com a ajuda da Stream API, verifique se todos os números da lista são
    // positivos e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean verificacao = numeros.stream()
                .allMatch(n -> n >= 0);

        if (verificacao) {
            System.out.println("Todos os números da lista são positivos");
        }
        else {
            System.out.println("Nem todos os números da lista são positivos");
        }
    }
}

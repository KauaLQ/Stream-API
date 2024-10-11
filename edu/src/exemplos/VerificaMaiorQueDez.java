package exemplos;
import java.util.*;

public class VerificaMaiorQueDez {
    // Desafio 6 - Verificar se a lista contém algum número maior que 10:
    // Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 54, 4, 31);

        numeros.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);
    }
}

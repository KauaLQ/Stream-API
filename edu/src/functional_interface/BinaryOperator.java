package functional_interface;
import java.util.*;

public class BinaryOperator {
    public static void main(String[] args) {
//          BinaryOperator<T>: Representa uma operação que combina dois argumentos do tipo T
//          e retorna um resultado do mesmo tipo T. É usada para realizar operações de redução
//          em pares de elementos, como somar números ou combinar objetos.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int resultado = numeros.stream()
                // reduce() recebe um BinaryOperator<T> para somar os elementos em uma lista
                .reduce(0, Integer::sum);
                // o parâmetro 0, identity, é similar a um variável temporária que irá armazenar
                // a soma de todos os números. A expressão lambda foi substituida pelo método reference para
                // simplificar mais a expressão

        System.out.println("A soma dos números é: " + resultado);
    }
}

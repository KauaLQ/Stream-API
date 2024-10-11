package functional_interface;
import java.util.*;

public class Function {

//  Function<T, R>: Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
//  É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 7, 8, 9);

        // map é utilizado para mapear os valores dentro de uma lista
        // por isso recebe um Function
        List<Integer> dobroNumeros = numeros.stream()
                .map(n -> n * 2)
                .toList();

        dobroNumeros.forEach(System.out::println);
    }
}

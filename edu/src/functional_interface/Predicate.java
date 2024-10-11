package functional_interface;
import java.util.*;
public class Predicate {
    public static void main(String[] args) {
//        Predicate<T>: Representa uma função que aceita um argumento do tipo T e retorna
//        um valor booleano (verdadeiro ou falso). É comumente usada para filtrar
//        os elementos do Stream com base em alguma condição.
        List<String> nomes = Arrays.asList("raul", "joao", "catarina", "marcelo", "davi", "natan", "francisco");

        nomes.stream()
                //o método filter() é utilizado para filtrar elementos em um Array,
                // por isso recebe um Predicate<T> que retorna um valor boolean de acordo com a expressão dada
                .filter(n -> n.length() < 5)
                .forEach(System.out::println);
    }
}

package functional_interface;
import java.util.*;
import java.util.stream.Stream;

public class Supplier {
//  Supplier<T>: Representa uma operação que não aceita nenhum argumento
//  e retorna um resultado do tipo T. É comumente usada para criar ou
//  fornecer novos objetos de um determinado tipo.
    public static void main(String[] args) {

        // o método generate recebe um Supplier como parâmetro
        // perceba que o Supplier não recebe nenhum parâmetro, por isso () é vazio
        List<String> saudacoes = Stream.generate(() -> "Olá mundo!")
        .limit(3)
        .toList();
        // como Supplier retorna um argumento T, este pode ser armazenado em uma variável ou lista
        // por isso o toList()

        saudacoes.forEach(System.out::println);
        // nessa situação a expressão lambda dentro do forEach foi substituída
        // pelo Method Reference
    }
}

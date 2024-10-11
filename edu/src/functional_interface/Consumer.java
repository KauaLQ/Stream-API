package functional_interface;
import java.util.*;

public class Consumer {
    //  Consumer<T>: Representa uma operação que aceita um argumento do tipo T
    //  e não retorna nenhum resultado. É utilizada principalmente para realizar
    //  ações ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 7, 8, 9);

        // neste exemplo, forEach() recebe um argumento do tipo Consumer<T>
        // perceba que não existem alterações ou retorno de valores, ele apenas apresenta uma variável
        numeros.forEach(n -> {
                if (n % 2 == 0){
                    System.out.println(n);
                }
            }
        );
        // Obs.: toda a programação utilizando Consumer foi resumida por uma expressão lambda para simplificar o código
        // mas o argumento do forEach continua sendo do tipo Consumer<T>
    }
}

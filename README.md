<img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=E76F00&height=120&section=header"/>

# Stream-API <img width='50' heigth='50' src="https://static-00.iconduck.com/assets.00/java-icon-1511x2048-6ikx8301.png" />
#### Olá, _Javeiros_! Você sabe o que é Stream API?
#### A _Streams API_ traz uma nova opção para a manipulação de coleções em Java, seguindo os princípios da programação funcional. Uma `Stream` é uma poderosa solução para processar coleções de maneira declarativa, em contraste com a tradicional forma imperativa.

## Programação Imperativa vs. Programação Declarativa
#### Na programação imperativa, o desenvolvedor precisa se preocupar com a forma como as iterações são realizadas e com a lógica detalhada para processar os elementos. Por exemplo, para realizar uma soma simples dos elementos de uma lista, você precisaria escrever um código como este:
### Exemplo Imperativo
```java
import java.util.Arrays;
import java.util.List;

public class ImperativeSum {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int soma = 0;

        for (Integer numero : numeros) {
            soma += numero;
        }

        System.out.println("Soma (Imperativa): " + soma);
    }
}
```
#### Na forma declarativa, por outro lado, você pode expressar o que deseja fazer sem se preocupar tanto com os detalhes de como a iteração deve acontecer:
### Exemplo Declarativo
```java
import java.util.Arrays;
import java.util.List;

public class DeclarativeSum {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        
        int soma = numeros.stream()
                          .mapToInt(Integer::intValue) // Converte para int
                          .sum(); // Realiza a soma

        System.out.println("Soma (Declarativa): " + soma);
    }
}
```
## Operações na Streams API
#### As operações na Streams API podem ser classificadas em duas categorias principais:
### 1. Operações Intermediárias
#### Operações que retornam uma nova `Stream` e permitem encadear várias operações, formando um pipeline de processamento de dados:
|Operação|Descrição|Exemplo|
|:---:|:---:|:---:|
|`filter(Predicate<T> predicate)`|Filtra os elementos da `Stream` com base em um critério|`stream.filter(n -> n > 5)`|
|`map(Function<T, R> mapper)`|Transforma cada elemento da `Stream`|`stream.map(s -> s.toUpperCase())`|
|`sorted()`|Organiza os elementos|`stream.sorted()`|
|`distinct()`|Remove duplicados|`stream.distinct()`|
|`limit(long maxSize)`|Limita o número de elementos|`stream.limit(10)`|
|`skip(long n)`|Pula os primeiros n elementos|`stream.skip(5)`|

### 2. Operações Terminais
#### Encerram o pipeline e produzem um resultado final:
|Operação|Descrição|Exemplo|
|:---:|:---:|:---:|
|`forEach(Consumer<T> action)`|Executa uma ação para cada elemento|`stream.forEach(System.out::println)`|
|`collect(Collector<T, A, R> collector)`|Coleta elementos em uma estrutura de dados|`stream.collect(Collectors.toList())`|
|`count()`|Retorna o número de elementos|`stream.count()`|
|`reduce(T identity, BinaryOperator<T> accumulator)`|Combina os elementos|`stream.reduce(0, (a, b) -> a + b)`|
|`toArray()`|Converte a Stream em um array contendo os elementos da Stream|`stream.toArray()`|
|`anyMatch(Predicate<T> predicate)`|Verifica se algum elemento da Stream atende ao predicado especificado|`stream.anyMatch(s -> s.startsWith("A"))`|

## Expressões Lambda
#### As expressões lambda permitem representar interfaces funcionais (interfaces com um único método abstrato) de forma mais concisa, possibilitando escrever código no estilo funcional.

### Sintaxe de uma Lambda:
```java
(argumento) -> (corpo)
```
### Exemplo de Expressão Lambda
```java
List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos");

// Usando lambda para imprimir nomes em maiúsculas
nomes.forEach(nome -> System.out.println(nome.toUpperCase()));
```

## Method Reference
#### _Method Reference_ é um recurso do Java 8 que permite referenciar um método de forma mais legível. Ele pode ser utilizado para indicar que um método deve ser usado em um ponto específico do código.

### Exemplo de Method Reference
```java
List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos");

// Usando method reference para imprimir nomes em maiúsculas
nomes.forEach(System.out::println); // Imprime os nomes em minúsculas
```
## Conclusão
#### Imagine escrever código de maneira mais simples, enxuta e ao mesmo tempo poderosa, onde o foco está no "o que" você quer fazer e não "como" fazer. A Streams API em Java oferece essa abordagem fluida e funcional. Ela transforma a forma como lidamos com coleções, tornando o código mais expressivo e eficiente.

#### Junto com expressões lambda e method references, a API não apenas torna o código mais limpo e fácil de ler, mas também prepara o terreno para soluções escaláveis e de fácil manutenção. Você pode realizar operações complexas com poucas linhas, e o melhor: de uma forma que se adapta automaticamente à execução paralela, sem dores de cabeça. É como se você deixasse de lado o trabalho manual repetitivo e focasse no que realmente importa.

#### Essa é a essência da programação funcional em Java — mais produtividade e menos burocracia, com a garantia de que o seu código será conciso, moderno e preparado para crescer com você.

---

### _Gostou do meu perfil? Você pode saber mais sobre mim em:_ &nbsp;&nbsp;[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/kaualimaq/)
### _Ou me contatar através do:_ &nbsp;&nbsp;[![Gmail](https://img.shields.io/badge/Gmail-333333?style=for-the-badge&logo=gmail&logoColor=red)](mailto:limakaua610@gmail.com)
### _Referência:_
[1] Repositório base DIO. Disponível em: https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java

[2] Documentação oficial da Streams API. Disponível em: https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html

[3] Recursos sobre Expressões Lambda. Disponível em: https://docs.oracle.com/javase/tutorial/java/javaOO/language/lambdaexpressions.html

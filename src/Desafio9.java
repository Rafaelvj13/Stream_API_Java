import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Desafio9 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se todos os números são distintos usando a Stream API
        Set<Integer> numerosDistintos = numeros.stream()
                .collect(Collectors.toSet());

        boolean todosDistintos = numerosDistintos.size() == numeros.size();

        // Exibir o resultado no console
        System.out.println("Todos os números são distintos? " + todosDistintos);
    }
}


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio4 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int posicao4 = numeros.get(4);
        System.out.println(posicao4);




        // Filtrar e remover os valores ímpares usando a Stream API
        List<Integer> numerosSemImpares = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra os números pares
                .collect(Collectors.toList()); // Coleta os valores filtrados em uma nova lista

        // Exibir a lista resultante no console
        System.out.println(numerosSemImpares);
    }
}

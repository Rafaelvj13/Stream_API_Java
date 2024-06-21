import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio10 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrar e agrupar os valores ímpares múltiplos de 3 ou de 5 usando a Stream API
        List<Integer> imparesMultiplosDe3Ou5 = numeros.stream()
                .filter(n -> n % 2 != 0) // Filtra os números ímpares
                .filter(n -> n % 3 == 0 || n % 5 == 0) // Filtra os múltiplos de 3 ou de 5
                .collect(Collectors.toList()); // Coleta os valores filtrados em uma nova lista

        // Exibir o resultado no console
        System.out.println("Valores ímpares múltiplos de 3 ou de 5: " + imparesMultiplosDe3Ou5);
    }
}


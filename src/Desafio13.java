import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio13 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Intervalo específico
        int limiteInferior = 5;
        int limiteSuperior = 10;

        // Filtrar os números que estão dentro do intervalo usando a Stream API
        List<Integer> numerosNoIntervalo = numeros.stream()
                .filter(n -> n >= limiteInferior && n <= limiteSuperior) // Filtra os números dentro do intervalo
                .collect(Collectors.toList()); // Coleta os valores filtrados em uma nova lista

        // Exibir o resultado no console
        System.out.println("Números no intervalo de " + limiteInferior + " a " + limiteSuperior + ": " + numerosNoIntervalo);
    }
}


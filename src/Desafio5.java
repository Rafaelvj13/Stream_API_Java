import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Desafio5 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        List<Integer> numerosMaioresque5 = numeros.stream()
                .filter(n-> n > 5)
                .collect(Collectors.toList());

        // Calcular a média dos números maiores que 5 usando a Stream API
        OptionalDouble media = numeros.stream()
                .filter(n -> n > 5) // Filtra os números maiores que 5
                .mapToInt(Integer::intValue) // Converte para IntStream
                .average(); // Calcula a média

        // Exibir o resultado no console
        if (media.isPresent()) {
            System.out.println("A média dos números maiores que 5 é: " + media.getAsDouble());
        } else {
            System.out.println("Não há números maiores que 5 na lista.");
        }

        System.out.println(numerosMaioresque5);
    }
}

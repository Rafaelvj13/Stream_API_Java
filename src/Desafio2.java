import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Somar os números pares usando a Stream API
        int somaPares = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra os números pares
                .mapToInt(Integer::intValue) // Converte para IntStream
                .sum(); // Soma os valores

        // Exibir o resultado no console
        System.out.println("A soma dos números pares é: " + somaPares);
    }
}

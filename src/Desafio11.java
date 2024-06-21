import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calcular a soma dos quadrados de todos os números usando a Stream API
        int somaDosQuadrados = numeros.stream()
                .mapToInt(n -> n * n) // Calcula o quadrado de cada número
                .sum(); // Soma os valores

        // Exibir o resultado no console
        System.out.println("A soma dos quadrados de todos os números da lista é: " + somaDosQuadrados);
    }
}

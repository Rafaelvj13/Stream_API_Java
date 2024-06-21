import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calcular o produto de todos os números usando a Stream API
        int produtoDosNumeros = numeros.stream()
                .reduce(1, (a, b) -> a * b); // Calcula o produto dos números

        // Exibir o resultado no console
        System.out.println("O produto de todos os números da lista é: " + produtoDosNumeros);
    }
}

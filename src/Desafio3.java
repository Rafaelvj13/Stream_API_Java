import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se todos os números são positivos usando a Stream API
        boolean todosPositivos = numeros.stream()
                .allMatch(n -> n > 0);

        // Exibir o resultado no console
        System.out.println("Todos os números são positivos? " + todosPositivos);
    }
}

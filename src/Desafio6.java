import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se a lista contém algum número maior que 10 usando a Stream API
        boolean algumMaiorQue10 = numeros.stream()
                .anyMatch(n -> n > 10);

        // Exibir o resultado no console
        System.out.println("A lista contém algum número maior que 10? " + algumMaiorQue10);
    }
}

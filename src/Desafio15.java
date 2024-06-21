import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se a lista contém pelo menos um número negativo usando a Stream API
        boolean contemNumeroNegativo = numeros.stream()
                .anyMatch(n -> n < 0); // Verifica se há algum número negativo

        // Exibir o resultado no console
        if (contemNumeroNegativo) {
            System.out.println("A lista contém pelo menos um número negativo.");
        } else {
            System.out.println("A lista não contém números negativos.");
        }
    }
}

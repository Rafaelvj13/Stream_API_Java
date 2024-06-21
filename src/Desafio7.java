import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar o segundo maior número usando a Stream API
        Optional<Integer> segundoMaior = numeros.stream()
                .distinct() // Remove duplicatas
                .sorted((a, b) -> b - a) // Ordena em ordem decrescente
                .skip(1) // Pula o primeiro elemento (o maior)
                .findFirst(); // Encontra o primeiro elemento após pular

        // Exibir o resultado no console
        if (segundoMaior.isPresent()) {
            System.out.println("O segundo maior número da lista é: " + segundoMaior.get());
        } else {
            System.out.println("Não foi possível encontrar o segundo maior número.");
        }
    }
}

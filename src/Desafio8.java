import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Somar os dígitos de todos os números usando a Stream API
        int somaDosDigitos = numeros.stream()
                .map(String::valueOf) // Converte cada número para String
                .flatMapToInt(str -> str.chars().map(Character::getNumericValue)) // Converte cada caractere de volta para inteiro
                .sum(); // Soma os valores

        // Exibir o resultado no console
        System.out.println("A soma dos dígitos de todos os números da lista é: " + somaDosDigitos);
    }
}

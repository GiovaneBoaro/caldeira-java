package aula02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um frase/palavra");
        String entrada = scanner.nextLine();

        String primeiraMetade = entrada.substring(0, (entrada.length() / 2));

        System.out.println("Metade do texto digitado: " + primeiraMetade);
    }
}

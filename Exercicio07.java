package lista08;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = 7; // pode trocar ou gerar aleatório
        int tentativa;

        System.out.print("Adivinhe o número de 1 a 10: ");
        tentativa = sc.nextInt();

        while (tentativa != secreto) {
            System.out.print("Errado. Tente novamente: ");
            tentativa = sc.nextInt();
        }

        System.out.println("Parabéns! Você acertou.");
        sc.close();
    }
}


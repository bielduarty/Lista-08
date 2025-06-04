package lista08;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int num;

        System.out.print("Digite um número positivo (ou negativo para sair): ");
        num = sc.nextInt();

        while (num >= 0) {
            soma += num;
            System.out.print("Digite outro número positivo: ");
            num = sc.nextInt();
        }

        System.out.println("Soma total: " + soma);
        sc.close();
    }
}

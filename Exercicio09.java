package lista08;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = sc.nextInt();
        int i = 1, fatorial = 1;

        while (i <= num) {
            fatorial *= i;
            i++;
        }

        System.out.println("Fatorial de " + num + " = " + fatorial);
        sc.close();
    }
}

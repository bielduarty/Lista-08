package lista08;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        while (n >= 0) {
            System.out.println(n);
            n--;
        }
        sc.close();
    }
}

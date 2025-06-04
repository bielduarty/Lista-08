package lista08;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double soma = 0;

        System.out.print("Digite uma nota (0 a 10): ");
        double nota = sc.nextDouble();

        while (nota >= 0 && nota <= 10) {
            soma += nota;
            count++;
            System.out.print("Digite outra nota (ou valor inválido para sair): ");
            nota = sc.nextDouble();
        }

        if (count > 0) {
            double media = soma / count;
            System.out.println("Média das notas: " + media);
        } else {
            System.out.println("Nenhuma nota válida inserida.");
        }

        sc.close();
    }
}

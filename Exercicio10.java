package lista08;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senhaDigitada;

        System.out.print("Digite a senha: ");
        senhaDigitada = sc.nextLine();

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Senha incorreta. Tente novamente: ");
            senhaDigitada = sc.nextLine();
        }

        System.out.println("Acesso permitido!");
        sc.close();
    }
}

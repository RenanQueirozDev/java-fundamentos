package Logica.Loops;

import java.util.Scanner;

// Apresentar ao usuário uma tela solicitando login e senha.
// Se acertar login e senha, exibir ACESSO CONCEDIDO.
// Caso contrário, exibir ACESSO NEGADO e voltar a pedir,
// repetindo até acertar a combinação.

public class LoginWhile {
    public static void main(String[] args) {
        Scanner dadosTeclado = new Scanner(System.in);
        String login = "";
        int senha = 0;
        while (!(login.equalsIgnoreCase("hesnan") && senha == 1234)) {
            System.out.println("Digite usuario e senha");
            login = dadosTeclado.nextLine();
            senha = dadosTeclado.nextInt();
        }
        System.out.println("ACESSO CONCEDIDO");
    }
}

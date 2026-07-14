import java.util.Scanner;

public class ScannerNomeIdade {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = lerDados.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = lerDados.nextInt();
        System.out.println("seu nome e: " + nome + " e sua idade e: " + idade);
    }
}

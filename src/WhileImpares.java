import java.util.Scanner;

// Eu como usuário gostaria de imprimir todos os números
// ímpares de 0 até o valor digitado pelo usuário.

public class WhileImpares {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numeroPraComparar = lerDados.nextInt();
        int maiorQue = 0;
        while (maiorQue <= numeroPraComparar) {
            maiorQue++;
            if (maiorQue % 2 == 1) {
                System.out.println(maiorQue);
            }
        }
    }
}

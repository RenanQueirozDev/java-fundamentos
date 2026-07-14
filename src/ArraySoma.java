import java.util.Scanner;

public class ArraySoma {
    public static void main(String[] args) {
        Scanner dadosTeclado = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite 5 numeros para somar:");
            numeros[i] = dadosTeclado.nextInt();
        }
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++) {
            resultado = resultado + numeros[i];
        }
        System.out.println("A soma total dos numeros e:");
        System.out.println(resultado);
    }
}

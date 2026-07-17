package Logica.Loops;
/*
 */
import java.util.Scanner;

        public class Foreach {
            public static void main(String[] args) {
                Scanner dadosTeclado = new Scanner(System.in);

                System.out.println("Quantas temperaturas serão registradas?");
                int tamanho = dadosTeclado.nextInt();

                int[] temperaturaRegistrada = new int[tamanho];

                System.out.println("Digite as temperatura registradas");

                for (int i = 0; i < temperaturaRegistrada.length; i++) {
                    temperaturaRegistrada[i] = dadosTeclado.nextInt();
                }

                for (int temperatura : temperaturaRegistrada) {

                    if (temperatura <= 15) {
                        System.out.println("Temperatura baixa");

                    } else if (temperatura > 16 && temperatura <= 30)
                        System.out.println( "Temperatura media");

                    else System.out.println("Temperatura alta");

                }
            }
        }






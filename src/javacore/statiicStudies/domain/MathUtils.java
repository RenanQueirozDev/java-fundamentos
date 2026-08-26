package javacore.statiicStudies.domain;
/*

Exercício 1 — método estático:
Cria uma classe MathUtils com 3 métodos estáticos:

sum(double a, double b) — retorna a soma OK
(int number) — retorna true se for par
max(double a, double b) — retorna o maior valor

No teste, chama os 3 sem criar objeto de MathUtils.
Exercício 2 — atributo estático:
Cria uma classe Employee nova (package diferente) com um atributo estático employeeCount que conta quantos objetos foram criados. Toda vez que um Employee é criado via construtor, esse contador incrementa.
No teste, cria 3 objetos e imprime Employee.employeeCount — deve mostrar 3.

exercicio de java hj, use skills que te dei pra me ajudar hj
 */


public class MathUtils {

    public static double sum(double a, double b) {
        double sum = a + b;
        return sum;

    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
    public static double max(double a, double b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}

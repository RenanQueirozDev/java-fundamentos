package javacore.interfaces.domain;


//Uma interface Desconto com um metodo que recebe um double (o valor original) e devolve um double (o valor final).
//Uma classe DescontoFixo que implementa Desconto. Ela guarda um valor em reais, recebido no construtor, e subtrai esse valor do preço.
// O resultado nunca pode ser negativo.
//Uma classe DescontoPercentual que implementa Desconto. Ela guarda um percentual, recebido no construtor, e aplica sobre o preço.
// O percentual só é aceito entre 0 e 100. Fora disso, ele fica em 0.
//Uma Main que cria um objeto de cada classe e imprime o resultado pra um preço de 80.
//
//Regra de qualidade: a validação do percentual deve ficar num setter, e o construtor deve chamar esse setter, como você fez no Employee.
//
//Saída esperada (desconto fixo de 10 e percentual de 25 sobre 80):
//
//Fixo: 70.0
//Percentual: 60.0
//
//Teste de borda: crie um DescontoPercentual com 150 e um DescontoFixo com 200, e confira se os resultados são coerentes com as regras.
public class DiscountFix implements Discount {
    private double value;

    @Override
    public double applyDiscount(double price) {
        if (price <= 0) {
            System.out.println("Invalid price");
            return 0;

        } else {
            return price - value;
        }
    }

    public double getValue() {
        return value;
    }

    public DiscountFix( double value){
            setValue(value);
        }

        public void setValue ( double value){
            if (value <= 0) {
                System.out.println("Invalid value");
                this.value = 0;

            } else {
                this.value = value;
            }


        }
    }



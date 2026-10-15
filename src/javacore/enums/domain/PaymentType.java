package javacore.enums.domain;
/*

Crie um enum PaymentType com DEBIT, CREDIT e PIX. Cada um tem:
code (int): 1, 2, 3
name (String): "Débito", "Crédito", "Pix"
Construtor e getters OK
Sobrescrita: crie no enum um metodo double calculateFee(double value) que retorna 0 (sem taxa).
O CREDIT sobrescreve e retorna 5% do valor.
Busca por atributo: crie um metodo static que recebe um int code e retorna o PaymentType correspondente. Se não achar, retorna null.
No main: busque o tipo pelo código 2, imprima o nome e a taxa de uma compra de 100. Depois faça o mesmo com o código 3.
 */
public enum PaymentType {
    DEBIT(1, "Debito"),
    CREDIT(2, "Credito") {
        @Override
        public double calculateFee(double value) {
            return value * 0.05;
        }
    },
    PIX(3, "Pix");


    public static PaymentType findByCode(int code) {
        for (PaymentType type : values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return null;

    }

    private final String displayName;
    private int code;

    private PaymentType(int code, String displayName) {
        this.displayName = displayName;
        this.code = code;
    }

    public double calculateFee(double value) {
        return 0;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getCode() {
        return code;
    }
}



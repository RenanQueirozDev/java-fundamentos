package javacore.abstractClasses.domain;
/*
Create an abstract class `Payment` with:

- A private `amount` attribute (`double`), initialized through the constructor, and a getter.
- An abstract method `calculateFee()` that returns a `double`.
- A concrete method `calculateTotal()` that returns the amount plus the fee.
- A concrete method `describe()` that prints one line of information.

Create two subclasses:

- `CreditCardPayment`: a fee of 3% of the amount.
- `PixPayment`: no fee.

In `main`, create a `List<Payment>` containing a credit card payment of `100.0`
and a Pix payment of `250.0`. Iterate through the list using a loop and call `describe()` on each payment.

 */
public abstract class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;

    }

    public abstract double calculateFee();

    public double calculateTotal() {
        return amount + calculateFee();
    }

    @Override //Amount: 100.0 | Fee: 3.0 | Total: 103.0
    public String toString() {
        return "Amount: " + amount + " | Fee: " + calculateFee() + " | Total: " + calculateTotal();
    }

    public double getAmount() {
        return amount;
    }
}


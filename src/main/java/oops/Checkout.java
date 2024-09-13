package oops;

interface PaymentProcessor {
    void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}

class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }
}

class Checkout {
    private PaymentProcessor processor;

    public Checkout(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void completeCheckout(double amount) {
        processor.processPayment(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor p = new CreditCardProcessor();
        PaymentProcessor p1 = new PayPalProcessor();
        Checkout obj = new Checkout(p1);
        obj.completeCheckout(200);

    }
}

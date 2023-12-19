package oop;

class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public void displayAmount() {
        System.out.println("Amount: $" + dollars + "." + cents);
    }

    public void setAmount(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }
}

class Product {
    private String name;
    private Money price;

    public Product(String name, int dollars, int cents) {
        this.name = name;
        this.price = new Money(dollars, cents);
    }

    public void displayProduct() {
        System.out.println("Product: " + name);
        price.displayAmount();
    }

    public void reducePrice(int reductionDollars, int reductionCents) {
        int newDollars = price.getDollars() - reductionDollars;
        int newCents = price.getCents() - reductionCents;

        if (newCents < 0) {
            newDollars -= 1;
            newCents += 100;
        }

        price.setAmount(newDollars, newCents);
    }

    public static void main(String[] args) {
        Product product = new Product("Product", 10, 50);
        product.displayProduct();

        System.out.println("Reducing price by $3.25");
        product.reducePrice(3, 25);
        product.displayProduct();
    }
}

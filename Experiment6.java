public class Experiment6 {
    // 20BAI10040 Shankar Lohar CSE3002 Programming in Java
    public static void main(String[] args) {
        // Example objects...
        // Banana @ 3.00 1.37Kg 4.11 SR
        // Pens @ 4.5 10 units 45 SR

        WeighedItem banana = new WeighedItem("Banana", 3.00, 1.37);
        System.out.println(banana);
        CountedItem pens = new CountedItem("Pens", 4.5, 10);
        System.out.println(pens);
    }

}

class PurchaseItem {
    private String name;
    private double unitPrice;

    PurchaseItem() {
        this.name = "No Item";
        this.unitPrice = 0;
    }

    PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return this.name + " @ " + this.unitPrice;
    }
}

class WeighedItem extends PurchaseItem {
    private double weight; // in KG

    public WeighedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice);
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * weight;
    }

    @Override
    public String toString() {
        // Banana @ 3.00 1.37Kg 4.11 SR
        return super.toString() + " " + weight + "Kg " + this.getPrice() + " Rs";
    }

}

class CountedItem extends PurchaseItem {
    private int quantity;

    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * quantity;
    }

    @Override
    public String toString() {
        // Pens @ 4.5 10 units 45 SR
        return super.toString() + " " + quantity + " units " + this.getPrice() + " Rs";
    }
}
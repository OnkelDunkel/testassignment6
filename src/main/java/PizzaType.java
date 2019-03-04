public class PizzaType {
    private int pizzaNo;
    private String name;
    private double price;

    public PizzaType(int pizzaNo, String name, double price) {
        this.pizzaNo = pizzaNo;
        this.name = name;
        this.price = price;
    }

    public String formatDisplayName() {
        return name + " - " + price + " DKK";
    }

    public int getPizzaNo() {
        return pizzaNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

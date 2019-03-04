import java.util.ArrayList;

public class PizzaOrder {

    private ArrayList<PizzaType> pizzas = new ArrayList<PizzaType>();
    private String customerName;

    public PizzaOrder(ArrayList<PizzaType> pizzas, String customerName) {
        this.pizzas = pizzas;
        this.customerName = customerName;
    }

    public double getTotalPrice() {
        double total = 0;
        for (PizzaType pizza : pizzas) {
            total += pizza.getPrice();
        }
        return total;
    }
}

import java.util.ArrayList;

public class MenuCard {

    ArrayList<PizzaType> pizzas = new ArrayList<PizzaType>();

    public void addPizza(PizzaType pizzaType) {
        pizzas.add(pizzaType);
    }

    public String showMenu() {
        String menu = "Menu:";
        for (PizzaType pizza : pizzas) {
            menu += "\n" + pizza.formatDisplayName();
        }
        return menu;
    }

    public PizzaType getPizzaByNo(int pizzaNo) {
        return null;
    }
}

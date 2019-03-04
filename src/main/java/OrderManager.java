import java.util.ArrayList;

public class OrderManager {


    private MenuCard menuCard;

    public OrderManager(MenuCard menuCard) {
        this.menuCard = menuCard;
    }

    public PizzaOrder placeOrder(String customerName, int[] orderItems) {

        ArrayList<PizzaType> pizzasInOrder = new ArrayList<PizzaType>();

        for (int i : orderItems) {
            pizzasInOrder.add(menuCard.getPizzaByNo(i));
        }

        return new PizzaOrder(pizzasInOrder, customerName);
    }
}

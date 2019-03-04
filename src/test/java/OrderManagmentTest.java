
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OrderManagmentTest {

    @Mock
    MenuCard menuCard  = mock(MenuCard.class);

    @Test
    public void testPlaceOrder() {
        OrderManager om = new OrderManager(menuCard);
        int[] orderItems = { 1, 2, 7};

        when(menuCard.getPizzaByNo(1))
                .thenReturn(new PizzaType(1, "Green dragon", 45.4));
        when(menuCard.getPizzaByNo(2))
                .thenReturn(new PizzaType(2, "Red dragon", 45.4));
        when(menuCard.getPizzaByNo(7))
                .thenReturn(new PizzaType(7, "Bluee dragon", 45.4));

        PizzaOrder order = om.placeOrder("Bob", orderItems);

        assertEquals(45.4 * 3, order.getTotalPrice());
    }
}

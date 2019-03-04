import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class MenuCardTest {

    @Mock
    PizzaType p1, p2 = mock(PizzaType.class);

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMenuCard() {

        when(p1.formatDisplayName()).thenReturn("pizza1");
        when(p2.formatDisplayName()).thenReturn("pizza2");

        MenuCard menuCard = new MenuCard();
        menuCard.addPizza(p1);
        menuCard.addPizza(p2);

        String menu = menuCard.showMenu();

        verify(p1).formatDisplayName();
        verify(p2).formatDisplayName();
    }

}

package infosys;



import com.infosys.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    void testInitialCart() {
        assertEquals(0, cart.getTotal());
    }

    @Test
    void testAddValidProduct() {
        cart.addProduct(1000);
        assertEquals(1000, cart.getTotal());
    }

    @Test
    void testAddAnotherProduct() {
        cart.addProduct(1000);
        cart.addProduct(500);
        assertEquals(1500, cart.getTotal());
    }

    @Test
    void testRemoveValidProduct() {
        cart.addProduct(1000);

        boolean result = cart.removeProduct(500);

        assertTrue(result);
        assertEquals(500, cart.getTotal());
    }

    @Test
    void testRemoveProductGreaterThanTotal() {
        cart.addProduct(1000);

        boolean result = cart.removeProduct(1500);

        assertFalse(result);
        assertEquals(1000, cart.getTotal());
    }

    @Test
    void testRemoveNegativeAmount() {
        cart.addProduct(1000);

        boolean result = cart.removeProduct(-500);

        assertFalse(result);
        assertEquals(1000, cart.getTotal());
    }
}
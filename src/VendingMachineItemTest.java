import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VendingMachineItemTest {
    VendingMachineItem testVendingMachineItem;

    @BeforeEach
    void setUp() {
        testVendingMachineItem = new VendingMachineItem("testItem", 5.0);
    }

    @AfterEach
    void tearDown() {
        testVendingMachineItem = null;
    }

    @Test
    void testVendingMachineItem_InvalidPrice() {
        assertThrows(VendingMachineException.class, () -> {
            new VendingMachineItem("test", -1.0);
        });
    }

    @Test
    void testGetName() {
        assertEquals("testItem", testVendingMachineItem.getName());
    }

    @Test
    void testGetPrice() {
        assertEquals(5.0, testVendingMachineItem.getPrice(), 0.001);
    }
}

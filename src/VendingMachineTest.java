import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class VendingMachineTest {
    VendingMachine myMachine;
    VendingMachineItem testItem;
    VendingMachineItem testItem2;

    @BeforeEach
    public void setUp() {
        myMachine = new VendingMachine();
        testItem = new VendingMachineItem("item", 5.0);
        testItem2 = new VendingMachineItem("item2", 8.0);
        myMachine.addItem(testItem, "A");
    }

    @AfterEach
    public void tearDown() {
        myMachine = null;
    }

    @Test
    void testAddItem_NotNullSlot() {
        // act, assert
        assertThrows(
                VendingMachineException.class, () -> myMachine.addItem(testItem2, "A"));
    }

    @Test
    void testGetBalance_Zero() {
        // act, assert
        assertEquals(0.0, myMachine.getBalance(), 0.001);
    }

    @Test
    void testGetBalance() {
        // act
        myMachine.insertMoney(5.0);
        // assert
        assertEquals(5.0, myMachine.getBalance(), 0.001);
        myMachine.insertMoney(10.0);
        assertEquals(15.0, myMachine.getBalance(), 0.001);
    }

    @Test
    void testGetItem_InvalidCode() {
        // act, assert
        assertThrows(
                VendingMachineException.class, () -> myMachine.getItem("E"));
    }

    @Test
    void testInsertMoney() {

    }

    @Test
    void testMakePurchase() {

    }

    @Test
    void testRemoveItem() {

    }

    @Test
    void testReturnChange() {

    }
}

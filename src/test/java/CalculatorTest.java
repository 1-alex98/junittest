import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    private Calculator calculator;
    private CalculatorController calculatorController;

    @BeforeEach
    public void setUp() {
        calculatorController = mock(CalculatorController.class);
        calculator = new Calculator(calculatorController);
    }

    @Test
    public void testAddMethod() {
        when(calculatorController.showInUi(3)).thenReturn(true);
        assertEquals(3, calculator.add(1, 2));
        verify(calculatorController).showInUi(3);
    }
    @Test
    public void testMinusOneOnUnsuccessful() {
        when(calculatorController.showInUi(3)).thenReturn(false);
        assertEquals(-1, calculator.add(1, 2));
        verify(calculatorController).showInUi(3);
    }
}
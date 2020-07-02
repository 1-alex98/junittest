public class Calculator {

    private final CalculatorController calculatorController;

    public Calculator(CalculatorController calculatorController) {
        this.calculatorController = calculatorController;
    }

    int add(int a, int b){
        int result = a + b;
        Boolean success = calculatorController.showInUi(result);

        if(!success){
            return -1;
        }
        return result;
    }
}

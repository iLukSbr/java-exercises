import java.lang.Math;

/**
 * The main part of the calculator doing the calculations.
 * 
 * @author Lucas Yukio Fukuda Matsumoto
 * @version 1.0
 */
public class CalcEngine {
    private double num;
    private double num2;
    private boolean operatorPressed;
    private char operator;

    /**
     * Create a CalcEngine.
     */
    public CalcEngine() {
        num = 0;
        num2 = 0;
        operatorPressed = false;
        operator = ' ';
    }

    /**
     * @return The value that should currently be displayed
     * on the calculator display.
     */
    public double getDisplayValue() {
        return operatorPressed ? num2 : num;
    }

    /**
     * A number button was pressed.
     * Either start a new operand, or incorporate this number as
     * the least significant digit of an existing one.
     * @param number The number pressed on the calculator.
     */
    public void numberPressed(double number) {
        if (operatorPressed) {
            num2 = num2 * 10 + number;
        } else {
            num = num * 10 + number;
        }
    }

    /**
     * The 'plus' button was pressed.
     */
    public void plus() {
        operatorPressed = true;
        operator = '+';
    }

    /**
     * The 'minus' button was pressed.
     */
    public void minus() {
        operatorPressed = true;
        operator = '-';
    }

    /**
     * The 'multiply' button was pressed.
     */
    public void multiply() {
        operatorPressed = true;
        operator = '*';
    }

    /**
     * The 'divide' button was pressed.
     */
    public void divide() {
        operatorPressed = true;
        operator = '/';
    }

    /**
     * The 'percentage' button was pressed.
     */
    public void percentage() {
        if (!operatorPressed) {
            num = num / 100;
        } else {
            num2 = (num * num2) / 100;
        }
    }

    /**
     * The 'square root' button was pressed.
     */
    public void squareRoot() {
        if (!operatorPressed) {
            num = Math.sqrt(num);
        } else {
            num2 = Math.sqrt(num2);
        }
    }

    /**
     * The 'square' button was pressed.
     */
    public void square() {
        if (!operatorPressed) {
            num = num * num;
        } else {
            num2 = num2 * num2;
        }
    }

    /**
     * The '=' button was pressed.
     */
    public void equals() {
        switch (operator) {
            case '+':
                num = num + num2;
                break;
            case '-':
                num = num - num2;
                break;
            case '*':
                num = num * num2;
                break;
            case '/':
                if (num2 != 0) {
                    num = num / num2;
                } else {
                    // Handle division by zero error
                    // You can choose to display an error or handle it differently.
                    // For now, let's set the result to zero.
                    num = 0;
                }
                break;
        }

        // Reset num2 and operator
        num2 = 0;
        operatorPressed = false;
        operator = ' ';
    }

    /**
     * The 'C' (clear) button was pressed.
     */
    public void clear() {
        num = 0;
        num2 = 0;
        operatorPressed = false;
        operator = ' ';
    }

    /**
     * @return The title of this calculation engine.
     */
    public String getTitle() {
        return "Calculator";
    }

    /**
     * @return The author of this engine. This string is displayed as it is,
     * so it should say something like "Written by H. Simpson".
     */
    public String getAuthor() {
        return "Written by Lucas Yukio Fukuda Matsumoto";
    }

    /**
     * @return The version number of this engine. This string is displayed as 
     * it is, so it should say something like "Version 1.1".
     */
    public String getVersion() {
        return "1.0";
    }
}
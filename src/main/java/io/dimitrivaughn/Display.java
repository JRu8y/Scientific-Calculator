package io.dimitrivaughn;
import java.util.*;

/**
 * Created by dimitrivaughn on 5/18/16.
 */
public class Display extends Calculator {


// declaration of fields

    private static Scanner scanner = new Scanner(System.in);
    public static DisplayModes defaultMode = DisplayModes.DECIMAL;
    public static DisplayModes currentMode = defaultMode;
    public static boolean calculatorOn = true;
    private static double memory = 0;

// methods to handle input and output

    public static void inputUpdate(String update){
        System.out.println(update);
    }

    public static String promptString(String update){
        inputUpdate(update);
        return scanner.next();
    }

    public static double promptDouble(String update){
        inputUpdate(update);
        double answer = 0;
        try{answer = scanner.nextDouble();}
        catch (Exception notANumber){
            inputUpdate("Please choose a valid number between 0-9");
            scanner.nextLine();
        }

        return answer;

        }

    public static void displayValue(){
        inputUpdate("Display value: "+result+" Memory value: "+memory);
    }

// turns off calculator

    public static void setCalculatorOff(){
        calculatorOn = false;
        inputUpdate("Goodbye!");
    }

// methods used to store memory

    public static void storeMemory(){
        memory = result;
    }

    public static void resetMemory(){
        memory = 0;
    }

    public static void callMemory(){
        result+= memory;
    }

// casting current display value as an integer for conversion to different display modes such as hexidecimal

    public int castasInteger(){
        return (int) result;
    }

// methods to perform and display mathematical operations

    public void addNumbers(){
        double a = promptDouble("Please enter a number:");
        result = add(a);
        inputUpdate("The sum is " + result);
    }

    public void subtractNumbers(){
        double a = promptDouble("Please enter a number:");
        result = subtract(a);
        inputUpdate("The difference is " + result);
    }

    public void multiplyNumbers(){
        double a = promptDouble("Please enter a number:");
        result = multiply(a);
        inputUpdate("The product is " + result);
    }

    public void divideNumbers() {
        double a = promptDouble("Please enter a number:");
        result = divide(a);
        inputUpdate("The quotient is " + result);
    }

    public void squareNumbers(){
        result = square(result);
        inputUpdate("The square is " + result);
    }

    public void squareRootOfNumbers(){
        result = squareRoot(result);
        inputUpdate("The square root is " + result);
    }

    public void exponentialOfNumbers(){
        double a = promptDouble("Raise to what power:");
        result = exponents(result, a);
        inputUpdate("To the power of "+ a + " is " + result);
    }

    public void inverseOfNumbers(){
        result = inverse(result);
        inputUpdate("The inverse is " + result);
    }

    public void sineOfNumbers(){
        result = sine(result);
        inputUpdate("The sine is " + result);
    }

    public void cosOfNumbers(){
        result = cos(result);
        inputUpdate("The Cosine is " + result);
    }

    public void tanOfNumbers(){
        result = tan(result);
        inputUpdate("The tangent is " + result);
    }

    public void inverseSineOfNumbers(){
        result = inverseSin(result);
        inputUpdate("The inverse sine is " + result);
    }

    public void inverseCosineOfNumbers(){
        result = inverseCos(result);
        inputUpdate("The inverse cosine is " + result);
    }

    public void inverseTanOfNumbers(){
        result = inverseTan(result);
        inputUpdate("The inverse tan is " + result);
    }

    public void logOfNumbers(){
        result = log(result);
        inputUpdate("The logarithmic value is " + result);
    }

    public void logX10OfNumbers(){
        result = log10X(result);
        inputUpdate("The logarithmic (10) value is " + result);
    }

    public void logNaturalOfNumbers(){
        result = logNatural(result);
        inputUpdate("The logarithmic natural value is " + result);
    }

    public void antiLogarithmicOfNumbers(){
        result = antiLogarithm(result);
        inputUpdate("The antilogarithmic value is " + result);
    }

    public void factorialOfNumbers(){
        result = factorial(result);
        inputUpdate("The factorial value is " + result);
    }

    public void degreesOfNumbers(){
        result = degrees(result);
        inputUpdate("The displayed value in degrees is "+ result);
    }

    public void radiansOfNumbers(){
        result = radians(result);
        inputUpdate("The displayed value in radians is " + result);
    }


// calculator engine

    public void runCalculator(){
        while(calculatorOn){
            displayValue();
            String choice = promptString("| add | subtract | multiply | divide | \n" +
            "| square | squareroot | exponential | inverse | sine | cosine | tan | \n"+
            "| inverse sine | inverse cosine | inverse tan | log | log10 | lognatural | \n"+
            "| loganti | factorial | switchdisplay | switchdisplaymode | \n"+
            "| clearmemory | storememory | callmemory | clear | turnoff | \n"+
            "Please choose the operation you would like to perform by typing its name:");

            switch(choice.toLowerCase()){
                case "add":
                    addNumbers();
                    break;
                case "subtract" :
                    subtractNumbers();
                    break;
                case "multiply":
                    multiplyNumbers();
                    break;
                case "divide":
                    divideNumbers();
                    break;
                case "square":
                    squareNumbers();
                    break;
                case "squareroot":
                    squareRootOfNumbers();
                    break;
                case "exponential":
                    exponentialOfNumbers();
                    break;
                case "inverse":
                    inverseOfNumbers();
                    break;
                case "sine":
                    sineOfNumbers();
                    break;
                case "cosine":
                    cosOfNumbers();
                    break;
                case "tan":
                    tanOfNumbers();
                    break;
                case "inversesine":
                    inverseSineOfNumbers();
                    break;
                case "inversecosine":
                    inverseCosineOfNumbers();
                    break;
                case "inversetan":
                    inverseTanOfNumbers();
                    break;
                case "log":
                    logOfNumbers();
                    break;
                case "log10":
                    logX10OfNumbers();
                    break;
                case "lognatural":
                    logNaturalOfNumbers();
                    break;
                case "antilog":
                    antiLogarithmicOfNumbers();
                    break;
                case "factorial":
                    factorialOfNumbers();
                    break;
                case "clearmemory":
                    resetMemory();
                    break;
                case "storememory":
                    storeMemory();
                    break;
                case "callmemory":
                    callMemory();
                    break;
                case "switchdisplay":
                    switchDisplay();
                    break;
                case "switchdisplaymode":
                    switchDisplayMode();
                    break;
                case "clear":
                    clearCalculator();
                    break;
                case "radians":
                    radiansOfNumbers();
                    break;
                case "degrees":
                    degreesOfNumbers();
                    break;
                case "turnoff":
                    setCalculatorOff();
                    break;

                default : inputUpdate("Unfortunately, this is not a supported feature");

            }
        }
    }

// Methods to switch display mode

    public void switchDisplay(){

        switch (currentMode){
            case DECIMAL:
                inputUpdate("The Decimal value of this number is: "+result);
                currentMode = DisplayModes.OCTAL;
                break;
            case OCTAL:
                inputUpdate("The Octal value of this number is: "+Long.toOctalString(castasInteger()));
                currentMode = DisplayModes.HEXIDECIMAL;
                break;
            case HEXIDECIMAL:
                inputUpdate("The Hexidecimal value of this number is: "+Long.toHexString(castasInteger()));
                currentMode = DisplayModes.BINARY;
                break;
            case BINARY:
                inputUpdate("The Binary value of this number is: "+ Long.toBinaryString(castasInteger()));
                currentMode = DisplayModes.DECIMAL;
                break;
            default:
                currentMode = DisplayModes.DECIMAL;
        }
    }

    public void switchDisplayMode(){
        String choice = promptString("Please type in your preferred mode: | decimal | binary | hexidecimal | octal| ");
        switch (choice.toLowerCase()){
            case "decimal": inputUpdate("The decimal value of the displayed value is "+ result);
                currentMode = DisplayModes.HEXIDECIMAL;
                break;
            case "binary": inputUpdate("The Binary value of the displayed value is "+Long.toBinaryString(castasInteger()));
                currentMode = DisplayModes.DECIMAL;
                break;
            case "hexidecimal": inputUpdate("The Hexidecimal value of the displayed value is " +Long.toHexString(castasInteger()));
                currentMode = DisplayModes.BINARY;
                break;
            case "octal": inputUpdate("The Octal version of the displayed value is " + Long.toOctalString(castasInteger()));
                currentMode = DisplayModes.HEXIDECIMAL;
                break;
            default:
                currentMode = DisplayModes.DECIMAL;
        }
    }
}








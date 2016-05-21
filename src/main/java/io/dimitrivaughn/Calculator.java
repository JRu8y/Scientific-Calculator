package io.dimitrivaughn;

/**
 * Created by dimitrivaughn on 5/18/16.
 */
public class Calculator {

// declaring fields

    public static double result;

// clears display value

    public static void clearCalculator(){
        result = 0;
    }

// methods handling all mathematical operations

    public static double add(double number){
        result += number;
        return result;
    }

    public static double subtract(double number){
        result -= number;
        return result;
    }

    public static double multiply(double number){
        result *= number;
        return result;
    }

    public static double divide(double number){
        result /= number;
        if(number == 0){
            Display.inputUpdate("Divide by 0 error");
        }
        return result;
    }

    public static double square(double number){
        result = number * number;
        return result;
    }

    public static double squareRoot(double number){
        result = Math.sqrt(number);
        return result;
    }

    public static double exponents(double number1, double number2){
        result = Math.pow(number1,number2);
        return result;
    }

    public static double inverse(double number){
        result = Math.abs(number);
        return result;
    }

    public static double sine(double number){
        result = Math.sin(number);
        return result;
    }

    public static double cos(double number){
        result = Math.cos(number);
        return result;
    }

    public static double tan(double number){
        result = Math.tan(number);
        return result;
    }

    public static double inverseSin(double number){
        result = Math.asin(number);
        return result;
    }

    public static double inverseCos(double number){
        result = Math.acos(number);
        return result;
    }

    public static double inverseTan(double number){
        result = Math.atan(number);
        return result;
    }

    public static double log(double number){
        result = Math.log(number);
        return result;
    }

    public static double log10X(double number){
        result = Math.log10(number);
        return result;
    }

    public static double logNatural(double number){
        result = Math.log1p(number);
        return result;
    }

    public static double antiLogarithm(double number){
        result = Math.pow(10,(-1)*number);
        return result;
    }

    public static double factorial(double number){
        double result = 1;
        for(double i = 1; i <= number; i++){
            result = i * result;
        }
        Calculator.result = result;
        return Calculator.result;
    }

    public static double degrees(double number){
        result = Math.toDegrees(number);
        return result;
    }

    public static double radians(double number){
        result = Math.toRadians(number);
        return result;
    }
}

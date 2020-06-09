package gc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Operation
{
    public static double getResult(double numberA, double numberB,
                                   String operator)
    {
        double result = 0;

        if ("+".equals(operator)) {
            result = numberA + numberB;
        } else if ("-".equals(operator)) {
            result = numberA - numberB;
        } else if ("*".equals(operator)) {
            result = numberA * numberB;
        } else if ("/".equals(operator)) {
            result = numberA / numberB;
        }

        return result;
    }
}

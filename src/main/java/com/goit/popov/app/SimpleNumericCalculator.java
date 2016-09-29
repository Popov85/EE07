package com.goit.popov.app;

import com.goit.popov.math.OperationFloat;
import com.goit.popov.math.OperationNumeric;

/**
 * Created by Andrey on 28.09.2016.
 */
public class SimpleNumericCalculator {

        public Number calculate(Number operand1, Number operand2, OperationNumeric operand, String operator) throws Exception {
                System.out.println("Actual class is: "+operand.getClass());
                if (operator.equals("+")) {
                        return operand.add(operand1, operand2);
                } else if (operator.equals("-")) {
                        return operand.subtract(operand1, operand2);
                } else if(operator.equals("*")) {
                        return operand.multiply(operand1, operand2);
                } else if (operator.equals("/")) {
                        return operand.divide(operand1, operand2);
                } else {
                        throw new Exception("Unsupported operation!");
                }
        }
}

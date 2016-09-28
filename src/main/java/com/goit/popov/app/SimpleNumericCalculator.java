package com.goit.popov.app;

import com.goit.popov.math.OperandNumeric;
import org.springframework.context.ApplicationContext;

/**
 * Created by Andrey on 28.09.2016.
 */
public class SimpleNumericCalculator implements NumericCalculator {

        private final ApplicationContext applicationContext = App.getApplicationContext();

        private OperandNumeric operand;

        private String operator;


        public Number calculate(Number operand1, Number operand2) throws Exception {
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

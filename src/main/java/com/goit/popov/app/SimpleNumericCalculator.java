package com.goit.popov.app;

import com.goit.popov.math.OperationNumeric;
import com.goit.popov.math.OperationUniversal;

/**
 * Created by Andrey on 28.09.2016.
 */
public class SimpleNumericCalculator {

        private OperationNumeric operation;

        public void setOperation(OperationNumeric operation) {
                this.operation = operation;
        }

        public SimpleNumericCalculator(OperationNumeric operation) {
                this.operation = operation;
        }

        public Number calculate(Number operand1, Number operand2, String operator) throws Exception {
                if (operator.equals("+")) {
                        return operation.add(operand1, operand2);
                } else if (operator.equals("-")) {
                        return operation.subtract(operand1, operand2);
                } else if(operator.equals("*")) {
                        return operation.multiply(operand1, operand2);
                } else if (operator.equals("/")) {
                        return operation.divide(operand1, operand2);
                } else {
                        throw new Exception("Unsupported operation!");
                }
        }


}

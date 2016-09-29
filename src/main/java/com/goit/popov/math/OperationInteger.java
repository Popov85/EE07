package com.goit.popov.math;

/**
 * Operand implementation for arithmetic operations on Integers
 *
 * @author Andrey Popov
 * @version 1.0
 */
public class OperandInteger implements OperandNumeric<Integer> {
        
        public Integer add(Integer number1, Integer number2) {
                return number1+number2;
        }

        public Integer subtract(Integer number1, Integer number2) {
                return number1-number2;
        }

        public Integer multiply(Integer number1, Integer number2) {
                return number1*number2;
        }

        public Integer divide(Integer number1, Integer number2) {
                return number1/number2;
        }
}

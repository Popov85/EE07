package com.goit.popov.math;
/**
 * Operand implementation for arithmetic operations on Longs
 *
 * @author Andrey Popov
 * @version 1.0
 */
public class OperandLong implements OperandNumeric<Long> {

        public Long add(Long number1, Long number2) {
                return number1+number2;
        }

        public Long subtract(Long number1, Long number2) {
                return number1-number2;
        }

        public Long multiply(Long number1, Long number2) {
                return number1*number2;
        }

        public Long divide(Long number1, Long number2) {
                return number1/number2;
        }


}

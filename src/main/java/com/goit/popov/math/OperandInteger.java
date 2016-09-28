package com.goit.popov.math;

/**
 * Created by Andrey on 28.09.2016.
 */
public class OperandInteger implements Operand<Integer> {
        
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

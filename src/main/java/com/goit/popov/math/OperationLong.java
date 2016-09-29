package com.goit.popov.math;
/**
 * Operation implementation for arithmetic operations on Longs
 *
 * @author Andrey Popov
 * @version 1.0
 */
public class OperationLong implements OperationNumeric<Long> {

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


        public Long add(Long number1, Integer number2) {
                return number1+number2;
        }

        public Long subtract(Long number1, Integer number2) {
                return number1-number2;
        }

        public Long multiply(Long number1, Integer number2) {
                return number1*number2;
        }

        public Long divide(Long number1, Integer number2) {
                return number1/number2;
        }


        public Long add(Integer number1, Long number2) {
                return number1+number2;
        }

        public Long subtract(Integer number1, Long number2) {
                return number1-number2;
        }

        public Long multiply(Integer number1, Long number2) {
                return number1*number2;
        }

        public Long divide(Integer number1, Long number2) {
                return number1/number2;
        }


}

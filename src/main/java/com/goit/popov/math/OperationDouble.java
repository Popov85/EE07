package com.goit.popov.math;

/**
 *
 */
public class OperationDouble implements OperationNumeric<Double> {

        public Double add(Double number1, Double number2) {
                return number1+number2;
        }

        public Double subtract(Double number1, Double number2) {
                return number1-number2;
        }

        public Double multiply(Double number1, Double number2) {
                return number1*number2;
        }

        public Double divide(Double number1, Double number2) {
                return number1/number2;
        }
}

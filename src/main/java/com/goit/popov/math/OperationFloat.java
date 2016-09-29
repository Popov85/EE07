package com.goit.popov.math;

/**
 * Created by Andrey on 29.09.2016.
 */
public class OperandFloat implements OperandNumeric<Float> {

        public Float add(Float number1, Float number2) {
                return number1+number2;
        }

        public Float subtract(Float number1, Float number2) {
                return number1-number2;
        }

        public Float multiply(Float number1, Float number2) {
                return number1*number2;
        }

        public Float divide(Float number1, Float number2) {
                return number1/number2;
        }
}

package com.goit.popov.math;

/**
 * Created by Andrey on 10/3/2016.
 */
public class OperationFloatIntImpl implements OperationNumericT<Float, Integer, Float> {

        public Float add(Integer n1, Float n2) {
                return (n1 + n2);
        }

        public Float subtract(Integer n1, Float n2) {
                return (n1 - n2);
        }

        public Float multiply(Integer n1, Float n2) {
                return (n1 * n2);
        }

        public Float divide(Integer n1, Float n2) {
                return (n1/ n2);
        }

}

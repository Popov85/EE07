package com.goit.popov.math;

/**
 * Created by Andrey on 9/29/2016.
 */
public class OperationFloatImpl implements OperationNumericT<Float, Float, Float> {

        public Float add(Float n1, Float n2) {
                return (n1 + n2);
        }

        public Float subtract(Float n1, Float n2) {
                return (n1 - n2);
        }

        public Float multiply(Float n1, Float n2) {
                return (n1 * n2);
        }

        public Float divide(Float n1, Float n2) {
                return (n1/ n2);
        }

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

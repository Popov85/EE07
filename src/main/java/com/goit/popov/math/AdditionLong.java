package com.goit.popov.math;

/**
 *  Addition implementation to add two longs
 *
 * @author Andrey Popov
 * @version 1.0
 */
@Deprecated
public class AdditionLong implements AdditionNumeric<Long> {

        public Long add(Long number1, Long number2) {
                return number1 + number2;
        }

        public Long add(Long number1, Integer number2) {
                return number1 + number2;
        }

        public Long add(Integer number1, Long number2) {
                return number1 + number2;
        }
}

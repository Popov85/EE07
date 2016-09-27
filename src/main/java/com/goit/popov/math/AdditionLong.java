package com.goit.popov.math;

/**
 *  Addition implementation to add two longs
 *
 * @author Andrey Popov
 * @version 1.0
 */
public class AdditionLong implements Addition<Long> {

        public Long add(Long number1, Long number2) {
                return number1 + number2;
        }
}

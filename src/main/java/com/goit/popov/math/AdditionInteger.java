package com.goit.popov.math;

/**
 *  Addition implementation to add two integers
 *
 * @author Andrey Popov
 * @version 1.0
 */
@Deprecated
public class AdditionInteger implements AdditionNumeric<Integer> {

        public Integer add(Integer number1, Integer number2) {
                return number2 + number1;
        }

        public Number add(Number number1, Number number2) {
                return null;
        }
}

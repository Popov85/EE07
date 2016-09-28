package com.goit.popov.math;

/**
 *  Subtraction implementation to subtract two integers
 *
 * @author Andrey Popov
 * @version 1.0
 */
@Deprecated
public class SubtractionInteger implements Subtraction<Integer> {

        public Integer subtract(Integer number1, Integer number2) {
                return number1 - number2;
        }
}

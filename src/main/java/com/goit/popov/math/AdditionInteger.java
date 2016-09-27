package com.goit.popov.math;

/**
 *  Addition implementation to add two integers
 *
 * @author Andrey Popov
 * @version 1.0
 */
public class AdditionInteger implements Addition<Integer> {

        public Integer add(Integer number1, Integer number2) {
                return number1 + number2;
        }
}

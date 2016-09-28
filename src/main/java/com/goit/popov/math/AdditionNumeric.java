package com.goit.popov.math;

/**
 * Addition numeric interface for arithmetic operation "plus" for numeric types
 *
 * @author Andrey Popov
 * @version 1.0
 */
@Deprecated
public interface AdditionNumeric<Number> extends Addition<Number> {
        /*
           Adds two numbers
        */
        Number add(Number number1, Number number2);
}

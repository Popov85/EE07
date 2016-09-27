package com.goit.popov.math;

/**
 * Addition interface for arithmetic operation "plus"
 *
 * @author Andrey Popov
 * @version 1.0
 */
public interface Addition<T> {
    /*
    Adds two objects
     */
    T add(T number1, T number2);
}

package com.goit.popov.math;

/**
 * Addition interface for arithmetic operation "plus"
 *
 * @author Andrey Popov
 * @version 1.0
 */
@Deprecated
public interface Addition<T> {
    /*
        Adds two objects
     */
    T add(T object1, T object2);
}

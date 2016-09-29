package com.goit.popov.math;

/**
 * Operation interface for arithmetic operations on different dataTypes
 *
 * @author Andrey Popov
 * @version 1.0
 */
public interface Operation<T> {

        T add(T object1, T object2);

        T subtract(T object1, T object2);

        T multiply(T object1, T object2);

        T divide(T object1, T object2);

}

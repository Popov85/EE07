package com.goit.popov.math;

/**
 * Operation interface for arithmetic operations on numeric dataTypes
 *
 * @author Andrey Popov
 * @version 1.0
 */
public interface OperationNumeric<T extends Number> extends Operation<T> {

        T add(T object1, T object2);

        T subtract(T object1, T object2);

        T multiply(T object1, T object2);

        T divide(T object1, T object2);
}

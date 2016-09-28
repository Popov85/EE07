package com.goit.popov.math;

/**
 * Created by Andrey on 28.09.2016.
 */
public interface Operand<T> {

        T add(T object1, T object2);

        T subtract(T object1, T object2);

        T multiply(T object1, T object2);

        T divide(T object1, T object2);

}

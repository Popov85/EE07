package com.goit.popov.app;

/**
 * Created by Andrey on 28.09.2016.
 */
public interface Calculator<T> {

        T calculate(T operand1, T operand2) throws Exception;
}

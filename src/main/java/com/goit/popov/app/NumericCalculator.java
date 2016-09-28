package com.goit.popov.app;

/**
 * Created by Andrey on 28.09.2016.
 */
public interface NumericCalculator extends Calculator<Number> {

        Number calculate(Number operand1, Number operand2) throws Exception;
}

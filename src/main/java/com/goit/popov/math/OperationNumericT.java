package com.goit.popov.math;

/**
 * Created by Andrey on 9/29/2016.
 */
public interface OperationNumericT<R extends Number, O1 extends Number, O2 extends Number> {

        R add(O1 number, O2 number2);

        R subtract(O1 number, O2 number2);

        R multiply(O1 number, O2 number2);

        R divide(O1 number, O2 number2);
}

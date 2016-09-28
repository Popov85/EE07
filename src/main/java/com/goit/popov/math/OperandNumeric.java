package com.goit.popov.math;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_OVERLAYPeer;

/**
 * Created by Andrey on 28.09.2016.
 */
public interface OperandNumeric<T extends Number> extends Operand<T> {

        T add(T object1, T object2);

        T subtract(T object1, T object2);

        T multiply(T object1, T object2);

        T divide(T object1, T object2);
}

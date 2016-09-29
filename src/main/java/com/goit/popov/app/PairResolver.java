package com.goit.popov.app;

import com.goit.popov.math.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Andrey on 28.09.2016.
 */
public class PairResolver {

        private static final ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        /*
        1. Int: Int-Int
        2. Long: Long-Long; Long-Int; Int-Long
        3. Float: Float-Float; Float-Long; Long-Float; Float-Int; Int-Float;
        4. Double: Double-Double; Double-Float; Float-Double; Double-Long; Long-Double; Double-Int; Int-Double
        */

        /*private final Number number1;
        private final  Number number2;

        public PairResolver(Number number1, Number number2) {
                this.number1 = number1;
                this.number2 = number2;
        }*/

        public OperationNumeric resolveType(Number number1, Number number2) throws Exception {
                if (number1 instanceof Double || number2 instanceof Double) {
                        return (OperationDouble) applicationContext.getBean("OperationDouble");
                } else if (number1 instanceof Float || number2 instanceof Float) {
                        return (OperationFloat) applicationContext.getBean("OperationFloat");
                } else if (number1 instanceof Long || number2 instanceof Long) {
                        return (OperationLong) applicationContext.getBean("OperationLong");
                } else if (number1 instanceof Integer || number2 instanceof Integer) {
                        return (OperationInteger) applicationContext.getBean("OperationInteger");
                } else throw new Exception();
        }
}

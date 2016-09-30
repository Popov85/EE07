package com.goit.popov.app;

import com.goit.popov.math.*;
import com.goit.popov.math.doublep.OperationDouble;
import com.goit.popov.math.floatp.OperationFloat;
import com.goit.popov.math.intp.OperationInteger;
import com.goit.popov.math.longp.OperationLong;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Andrey on 28.09.2016.
 */
@Deprecated
public class PairResolver {

        private static final ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        /*
        *  Variants:
        1. Int: Int-Int
        2. Long: Long-Long; Long-Int; Int-Long
        3. Float: Float-Float; Float-Long; Long-Float; Float-Int; Int-Float;
        4. Double: Double-Double; Double-Float; Float-Double; Double-Long; Long-Double; Double-Int; Int-Double
        */
        public OperationNumeric resolveType(Number number1, Number number2) throws Exception {
                if (number1 instanceof Double || number2 instanceof Double) {
                        // doublep package is in use
                        return (OperationDouble) applicationContext.getBean("OperationDouble");
                } else if (number1 instanceof Float || number2 instanceof Float) {
                        // floatp package is in use
                        return (OperationFloat) applicationContext.getBean("OperationFloat");
                } else if (number1 instanceof Long || number2 instanceof Long) {
                        // longp package is in use
                        return (OperationLong) applicationContext.getBean("OperationLong");
                } else if (number1 instanceof Integer || number2 instanceof Integer) {
                        // intp package is in use
                        return (OperationInteger) applicationContext.getBean("OperationInteger");
                } else throw new Exception();
        }
}

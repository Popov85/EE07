package com.goit.popov.app;

import com.goit.popov.math.OperationFloat;
import com.goit.popov.math.OperationNumeric;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Entry point for launching a calculator implementation
 *
 * @author Andrey Popov
 * @version 1.0
 */

public class App {

        private static ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");

        private static InputParser inputParser;
        private static SimpleNumericCalculator calc;
        private static TypeResolver typeResolver;
        private static PairResolver pairResolver;

        public static ApplicationContext getApplicationContext() {
                return App.applicationContext;
        }

        public static void main(String[] args) {
                /*OperationFloat o = (OperationFloat) applicationContext.getBean("OperationFloat");
                System.out.println(o.add(12, 22.1f));*/
                inputParser = (InputParser) applicationContext.getBean("Parser");
                calc = (SimpleNumericCalculator) applicationContext.getBean("Calculator");
                typeResolver = (TypeResolver) applicationContext.getBean("TypeResolver");
                pairResolver = (PairResolver) applicationContext.getBean("PairResolver");
                String line = getLine("Enter a math expression");
                try {
                        String operator = inputParser.getOperator(line);
                        String firstArgument  = inputParser.getFirstArgument(line);
                        String secondArgument  = inputParser.getSecondArgument(line);
                        System.out.println(operator+"\n"+firstArgument+"\n"+secondArgument);
                        Number type1 = typeResolver.resolveType(firstArgument);
                        Number type2 = typeResolver.resolveType(secondArgument);
                        System.out.println("type1 = "+type1.getClass());
                        System.out.println("type2 = "+type2.getClass());
                        OperationNumeric o = pairResolver.resolveType(type1, type2);
                        System.out.println("OperationNumeric = "+o.getClass());
                        System.out.println(calc.calculate(type1, type2, o, operator));
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
        }

        private static String getLine(String explanation) {
                System.out.println(explanation+"\n");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String expression = null;
                try {
                        expression= br.readLine();
                } catch (IOException e) {
                        e.printStackTrace();
                }
                return expression;
        }

}

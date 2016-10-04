package com.goit.popov.app;

import com.goit.popov.math.OperationFloatImpl;
import com.goit.popov.math.OperationFloatIntImpl;
import com.goit.popov.math.OperationNumericT;
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
                new ClassPathXmlApplicationContext("application-context.xml","aop-context.xml");

        private static Parser inputParser;
        private static SimpleNumericCalculator calc;
        private static TypeResolver typeResolver;

        public static void main(String[] args) {
                try {
                        String line = getLine("Enter a math expression:\n");
                        inputParser = (InputParserExtended) applicationContext.getBean("Parser");
                        typeResolver = (TypeResolver) applicationContext.getBean("TypeResolver");
                        Number operand1 = typeResolver.resolveType(inputParser.getFirstArgument(line));
                        Number operand2 = typeResolver.resolveType(inputParser.getSecondArgument(line));
                        calc = (SimpleNumericCalculator) applicationContext.getBean("Calculator");
                        System.out.println("Result of: \n"+line+" = "+
                                calc.calculate(operand1,operand2, inputParser.getOperator(line)));
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

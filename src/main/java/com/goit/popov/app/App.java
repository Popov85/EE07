package com.goit.popov.app;

import com.goit.popov.math.Addition;
import com.goit.popov.math.AdditionInteger;
import com.goit.popov.math.AdditionNumeric;
import com.goit.popov.math.Subtraction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Simple calculator emulator based on Spring framework
 *
 * @author Andrey Popov
 * @version 1.0
 */

public class App {

        private static ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");

        private static AdditionNumeric addition;
        private static Subtraction subtraction;
        private static InputParser inputParser;

        public static ApplicationContext getApplicationContext() {
                return applicationContext;
        }

        public static void main(String[] args) {
                addition = (AdditionInteger) applicationContext.getBean("AddInt");
                inputParser = (InputParser) applicationContext.getBean("Parser");
                //Integer result = (Integer) addition.add(2,2);
                //System.out.println(result);
                String line = getLine("Enter a math expression");
                try {
                        System.out.println(inputParser.getOperator(line));
                        System.out.println(inputParser.getFirstArgument(line));
                        System.out.println(inputParser.getSecondArgument(line));

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

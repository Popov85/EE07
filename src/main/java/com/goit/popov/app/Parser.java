package com.goit.popov.app;

/**
 *  Parser interface defines how to obtain operators and operands from a string
 *
 * @author Andrey Popov
 * @version 1.0
 */
public interface Parser {

        String getOperator(String line) throws Exception;

        String getFirstArgument(String line);

        String getSecondArgument(String line);

}

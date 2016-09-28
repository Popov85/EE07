package com.goit.popov.app;

/**
 * Interface for resolving a numeric type of user's input
 *
 * @author Andrey Popov
 * @version 1.0
 */
public interface Resolver {

        Number resolveType(String specimen) throws Exception;

        boolean isInteger(String input);

        boolean isLong(String input);

        boolean isFloat(String input);

        boolean isDouble(String input);
}

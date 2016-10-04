package com.goit.popov.app;

/**
 * Extended parser implementation
 *
 * @author Andrey Popov
 * @version 1.0
 */
public class InputParserExtended implements Parser {

        public static final String OPERATIONS = "[-+/*]";
        public static final String[] OPERATIONS_AS_ARRAY = {"-","+","/","*"};

        private String symbol;

        public String getOperator(String line) throws Exception {
                if (ifContains(line)) {
                        return symbol;
                }
                else {
                        throw new Exception("Illegal operation!");
                }
        }

        public boolean ifContains(String line) {
                for(int i=0; i < OPERATIONS_AS_ARRAY.length; i++) {
                        if(line.contains(OPERATIONS_AS_ARRAY[i])) {
                                symbol = OPERATIONS_AS_ARRAY[i];
                                return true;
                        }
                }
                return false;
        }

        public String getFirstArgument(String line) {
                return getParts(line)[0];
        }

        public String getSecondArgument(String line) {
                return getParts(line)[1];
        }

        private String[] getParts(String line) {
                return line.split(OPERATIONS);
        }
}

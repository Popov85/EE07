package com.goit.popov.app;

/**
 * Analyses the type of an entered stuff
 *
 * @author Andrey Popov
 * @version 1.0
 */
public class TypeResolver implements Resolver {

        private Number operand;

        public Number resolveType(String specimen) throws Exception {
                if (isInteger(specimen)) {
                        return operand;
                } else if (isLong(specimen)) {
                        return operand;
                } else if (isFloat(specimen)) {
                        return operand;
                } else if (isDouble(specimen)) {
                        return operand;
                }
                else {
                        throw new Exception("Illegal type!");
                }
        }

        private boolean isInteger(String input) {
                try {
                        operand = Integer.parseInt(input);
                        return true;
                }
                catch(Exception e) {
                        return false;
                }
        }

        private boolean isLong(String input) {
                try {
                        operand = Long.parseLong(input);
                        return true;
                }
                catch(Exception e) {
                        return false;
                }
        }

        private boolean isFloat(String input) {
                try {
                        operand = Float.parseFloat(input);
                        return true;
                }
                catch(Exception e) {
                        return false;
                }
        }

        private boolean isDouble(String input) {
                try {
                        operand = Double.parseDouble(input);
                        return true;
                }
                catch(Exception e) {
                        return false;
                }
        }
}

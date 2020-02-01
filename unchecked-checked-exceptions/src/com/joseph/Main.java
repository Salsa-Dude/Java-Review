package com.joseph;

public class Main {


    // NOTES
    /* A method that can throw a checked Exception must specify the exception in a throws clause.
      When invoking such a method, the calling one must either surround the invocation with a try-catch block
      or specify the exception in its throws clause

      There are no requirements regarding exception handling on a method that throws an unchecked exception,
      as well as on its calling methods
     */

    // ****************** Unchecked Exception *********************

    public static void main(String[] args) {
	// write your code here
        // for a uncheck exception we don't need to add a try-clause
        doSomething1();
    }

    // Throwing a unchecked exception
    // - We don't need to declare the throws RuntimeException on the method
    //  public static void doSomething() throws RuntimeException {
    // Both way would work for a unchecked exception
    public static void doSomething1() {
        // Unchecked Exception
        throw new RuntimeException();
    }

    // ****************** Checked Exception *********************

    public static void main2(String[] args) throws Exception {
        // There are two ways to deal with a unhandled Exception calling
        // 1) Wrap it in a try and catch clause
//        try {
//            doSomething2();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
        // 2) The other option is to re-throw the exception futher up the call stack.
        // public static void main2(String[] args) throws Exception {

        doSomething2();

    }

    // A method that can throw a checked Exception must declare the exception on the method
    public static void doSomething2() throws Exception {
        // Unchecked Exception
        throw new Exception();
    }
}

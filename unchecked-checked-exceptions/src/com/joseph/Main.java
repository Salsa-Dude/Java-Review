package com.joseph;

public class Main {


    // NOTES

    /* Checked exceptions are exceptional conditionals that a well written application should anticipate and recover from.
    The code the might throw a checked exception must be enclosed by either
     1) A Try block that catches the exception, followed by a catch or a finally block or both that handles the exception
     2) A method that specifies that it can throw the exception; the method must provide a throws clause that lists the exception

     All exceptions are checked exceptions, except for those indicated by Error, RuntimeException, and their subclasses.
     - Unchecked exceptions are exceptional conditions that are internal to the application. These are usually programming bugs, such as logic errors or improprer use of an API
     - Unchecked exceptions are indicated by RuntimeException and its subclasses

    Errors are exceptional conditions that are external to the application.
    for example OutOfMemoryError occurs when JVM runs out of memory or StackOverFlowError occurs when a stack overflows
    - Errors are represented by Error and its subclassses

     */

    // A Try-Catch Block

    try {
        // Statments that may throw exceptions
        System.out.println("Normal program flow");
    } catch (Exception e) {
        System.out.println("Exception branch");
    }





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

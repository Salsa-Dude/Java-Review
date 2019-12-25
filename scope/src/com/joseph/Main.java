package com.joseph;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String varFour = "this is private to main";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();
        System.out.println("scopeInstance private var is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();
        System.out.println("**************************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();

        innerClass.timesTwo();

    }
}

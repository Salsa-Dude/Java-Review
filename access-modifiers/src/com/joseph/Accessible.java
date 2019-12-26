package com.joseph;

// Challenge
// In the following declaration, what is the visibilty of?

// 1. interface Accessible - (private, class is only accessible within the com.joseph package)
// 2. the int variable SOME_CONSTANT - (public, all interface variables are public static final)
// 3. methodA - (public, accessible outside of the class and package)
// 4. methodB - (public, because all interface methods are automatically public)
// 5. methodC - (public, because all interface methods are automatically public)


interface Accessible {
    int SOME_CONSTANT = 30;
    public void methodA();
    void methodB();
    boolean methodC();
}

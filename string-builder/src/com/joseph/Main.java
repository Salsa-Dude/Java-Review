package com.joseph;

// A StringBuffer instance is a thread-safe, mutable sequence of characters; it is like a String, but can be modified; at any point in time a StringBuffer contains some particular sequence of characters, but the length and contents of the sequence can be changed through certain method calls


public class Main {

    public static void main(String[] args) {
	// write your code here

        // An append method appends the string representation of the argument to the current sequence
        StringBuffer stringBuffer = new StringBuffer("OCA");
        stringBuffer.append("Jp");
        System.out.println(stringBuffer);

        // An insert method inserts the string representation of the argument into the current sequence at the specified position.
        StringBuffer stringBuffer1 = new StringBuffer("OJP");
        stringBuffer1.insert(1, "CA");
        System.out.println(stringBuffer1);

        // The replace method replaces characters in a substring of the current sequence with characters in the specified String
        StringBuffer stringBuffer2 = new StringBuffer("OCAJP");
        stringBuffer2.replace(1, 3, "K");
        System.out.println(stringBuffer2);

        // The delete and deleteCharAt methods remove characters of the current sequence.
        // - delete(int start, int end): remove characters within the specified range
        // - deleteChartAt(int index): removes characters at the index position
        StringBuffer stringBuffer3 = new StringBuffer("OCAJP");
        stringBuffer3.delete(0,2);
        System.out.println(stringBuffer3);
        stringBuffer3.deleteCharAt(0);
        System.out.println(stringBuffer3);

        // The reverse method causes the current character sequence to be replaced by the reverse of the sequence.
        StringBuffer stringBuffer4 = new StringBuffer("OCAJP");
        stringBuffer4.reverse();
        System.out.println(stringBuffer4);
    }
}

package com.jwilson;

public class Main {

    public static void main(String[] args) {
	    byte myByte = 100;
	    short myShort = 450;
	    int myInt = 780;
	    long myLong = 50000L + 10L *(myByte + myShort + myInt);

	    System.out.println(myLong);
    }
}

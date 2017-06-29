package com.jwilson;

/**
 * Created by jwilson on 16/06/2017.
 */
public class StringUtilities {

    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c){
        this.sBuilder.append(c);
        charsAdded++;
    }

}

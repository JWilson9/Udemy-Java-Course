package com.jwilson;

/**
 * Created by jwilson on 16/06/2017.
 */
public class Main {

    public static void main(String[] args){
        StringUtilities utils = new StringUtilities();
        StringBuilder sb = new StringBuilder();

        while(sb.length() < 10){
            utils.addChar(sb, 'a');
        }
        System.out.println(sb);
    }
}

package com.Stack;

import java.util.Stack;

public class Reverse_String {

    public String  reverse(String str){
        Stack <Character> stack = new Stack<>();
        char [] chars = str.toCharArray();
        for (char c : chars){
            stack.push(c);
        }
        for (int i=0; i<str.length(); i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {

        Reverse_String rs = new Reverse_String();

        System.out.println(rs.reverse("Taimoor"));

    }
}

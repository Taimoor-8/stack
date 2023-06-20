package com.Stack;

import java.util.Stack;

public class Valid_Paranthesis {

    public boolean isValid(String str){
        char[] c = str.toCharArray();
        Stack<Character> s = new Stack<>();
        for (char chars : c){
            if (chars == '(' || chars == '{' || chars == '['){
                s.push(chars);
            }
            else {
                if (s.isEmpty()){
                    return false;
                }
                else {
                    char top = s.peek();
                    if ((chars == ')' && top == '(') ||
                            (chars == '}' && top == '{') ||
                            (chars == ']' && top == '[')){
                        s.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {

        Valid_Paranthesis vp = new Valid_Paranthesis();
        if (vp.isValid("(){")){
            System.out.println("The inserted parentheses are valid");
        }
        else System.out.println("The inserted parentheses are not valid");

    }
}

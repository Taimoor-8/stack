package com.Stack;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element {
    public int[] greaterElement(int[] arr){
        int[] result = new int[arr.length];
        Stack <Integer> element = new Stack<>();
        for (int i= arr.length-1; i>=0; i--){
            if (!element.empty()){
                while (!element.empty() && element.peek() <= arr[i]){
                    element.pop();
                }
            }
            if (element.empty()){
                result[i] = -1;
            }
            else {
                result[i] = element.peek();
            }
            element.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {

        Next_Greater_Element nge = new Next_Greater_Element();
        int[] arr = {4,7,3,4,8,1};
        System.out.println(Arrays.toString(nge.greaterElement(arr)));
    }
}

package com.allron.javalearn.algorithm;

import java.util.Stack;

/**
 * 栈应用
 *
 * @author Allron
 * @date 2021/3/2
 */
public class 符号比较 {

    public static void main(String[] args) {
        System.out.println(isValid("((()))"));
    }

    private static boolean isValid(String str){
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<chars.length;i++){
            if(chars[i] == '('){
                stack.push(chars[i]);
            }else {
                if(stack.peek() == '('){
                    stack.pop();
                }else if(stack.empty()){
                    return false;
                }
            }
            if(chars.length -1 == i){
                return stack.empty();
            }
        }
        return true;
    }
}

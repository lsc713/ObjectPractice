package com.service.javamid.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 후위표기식 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);
            switch (now){
                case '*':
                case '+':
                case '-':
                case '/':
                    while(!stack.isEmpty()&&priority(stack.peek())>=priority(now)){
                        sb.append(stack.pop());
                    }
                    stack.add(now);
                    break;
                case '(':
                    stack.add(now);
                    break;
                case ')':
                    while (!stack.isEmpty() && priority(stack.peek()) != '(') {
                        sb.append(stack.pop());
                    }
                    stack.pop();
                    break;
                default:
                    sb.append(now);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }

    static int priority(char operator){
        if (operator == '(' || operator == ')') {
            return 0;
        }else if(operator=='+'||operator=='-'){
            return 1;
        }else if(operator=='*'||operator=='/'){
            return 2;
        }
        return -1;
    }

}

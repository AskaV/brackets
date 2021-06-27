package com.Tanda;

import java.util.List;
import java.util.Stack;

public class BalanceVerificator {
    List<String> listOpen = List.of("(", "{", "[");
    List<String> listClose = List.of(")", "}", "]");
    Stack<String> stack = new Stack<>();

    public int verify(String stroka1) {
        for (char ch : stroka1.toCharArray()) {  //String[] parts = stroka1.split("");
            int pos = listClose.indexOf(String.valueOf(ch));
            if (listOpen.contains(String.valueOf(ch))) {
                stack.push(String.valueOf(ch)); // open bracket found, add bracket to stack
                continue;
            }
            if (pos != -1) {
                if (listOpen.get(pos).equals(stack.lastElement())) {  //stack.lastElement() == listOpen.get(pos)
                    stack.pop();
                } else
                    return stroka1.indexOf(ch);
            } else
                throw new IllegalArgumentException("\nOutput: A character ‘" + ch + "’ doesn’t belong to any known brackets type.");
        }
        return -1;
    }

}
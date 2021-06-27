package com.Tanda;

import java.util.List;
import java.util.Stack;

/** Brackets balance verification
 *  (aka HackerRank stack problem)
 *  A bracket is considered to be one of the following characters: (), {}, [].
 *  Brackets are considered matched pair if it occurs that every open bracket has closing
 * bracket of the exact the same type (‘(’, ‘{’, ‘[’), ie.
 * 1. ‘()’, ‘{}’, ‘[]’ - balanced, open and closed brackets exist
 * 2. ‘(}’ - not balanced, open and closed brackets has different type
 * 3. ‘((())’ - not balanced, number of open brackets does not equal to the number of
 * closing ones;
 *
 * A matching pair of brackets is not balanced when the set of brackets it encloses are not
 * matched, ie. ({[(]}) is not balanced because the contents between [ and ] are not balanced.
 * The pair of square brackets contains a single unbalanced bracket ‘(’ between them.
 */
public class BalanceVerificator {
    List<String> listOpen = List.of("(", "{", "[");
    List<String> listClose = List.of(")", "}", "]");
    Stack<String> stack = new Stack<>();

    public int verify(String stroka1) {
        for (char ch : stroka1.toCharArray()) {
            int pos = listClose.indexOf(String.valueOf(ch));
            if (listOpen.contains(String.valueOf(ch))) {
                stack.push(String.valueOf(ch)); // open bracket found, add bracket to stack
                continue;
            }
            if (pos != -1) {
                if (listOpen.get(pos).equals(stack.lastElement())) {
                    stack.pop();
                } else {
                    System.out.println("\nOutput: NOT BALANCED (" + stroka1.indexOf(ch) + ")");
                    return stroka1.indexOf(ch);
                }
            } else
                throw new IllegalArgumentException("\nOutput: A character ‘" + ch + "’ doesn’t belong to any known brackets type.");
        }
        if (stack.empty()) {
            System.out.println("\nOutput: BALANCED");
            return -1;
        } else {
            System.out.println("\nOutput: NOT BALANCED (" + stroka1.length() + ")");
            return stroka1.length();
        }
    }

}

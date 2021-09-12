package bai_11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class ReverseSingStackString {

    public ReverseSingStackString() {
    }

    public String reverseString(String elements) {
        Stack<Character> wStack = new Stack<>();
        for (int i = 0; i < elements.length(); i++) {
            wStack.push(elements.charAt(i));
        }
        String output = "";
        for (int i = 0; i < elements.length(); i++) {
            char mWord = wStack.pop();
            output += mWord;
        }
        return output;
    }
}

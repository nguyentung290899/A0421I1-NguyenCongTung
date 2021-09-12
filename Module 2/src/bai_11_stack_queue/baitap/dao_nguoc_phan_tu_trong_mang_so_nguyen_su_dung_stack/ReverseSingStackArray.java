package bai_11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class ReverseSingStackArray<T> {

    public ReverseSingStackArray() {
    }

    public void reverseArray(T[] elements) {
        Stack<T> stack = new Stack<>();
        for (T element : elements) {
            stack.push(element);
        }
        for (int i = 0; i < elements.length; i++) {
            elements[i] = stack.pop();
        }
    }
}
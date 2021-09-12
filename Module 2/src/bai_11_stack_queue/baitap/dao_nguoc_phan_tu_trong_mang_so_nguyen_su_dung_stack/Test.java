package bai_11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;


public class Test {
    public static void main(String[] args) {
        Integer[] integer = new Integer[5];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        integer[3] = 4;
        integer[4] = 5;
        ReverseSingStackArray<Integer> stack = new ReverseSingStackArray<>();
        stack.reverseArray(integer);
        for (Integer value : integer) {
            System.out.println(value);
        }
        String name = "Nguyen Cong Tung";
        ReverseSingStackString wStack = new ReverseSingStackString();
        name = wStack.reverseString(name);
        System.out.println(name);
    }
}


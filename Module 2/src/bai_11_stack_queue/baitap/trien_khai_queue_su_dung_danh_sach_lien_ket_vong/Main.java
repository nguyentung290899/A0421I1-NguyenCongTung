package bai_11_stack_queue.bai_tap.trien_khai_queue_su_dung_danh_sach_lien_ket_vong;

import static bai_11_stack_queue.bai_tap.trien_khai_queue_su_dung_danh_sach_lien_ket_vong.Solution.*;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;

        enQueue(q, 10);
        enQueue(q, 15);
        enQueue(q, 8);
        enQueue(q, 11);

        displayQueue(q);

        System.out.println(deQueue(q));
        System.out.println(deQueue(q));
        displayQueue(q);

        enQueue(q, 11);
        enQueue(q, 18);
        displayQueue(q);

    }
}

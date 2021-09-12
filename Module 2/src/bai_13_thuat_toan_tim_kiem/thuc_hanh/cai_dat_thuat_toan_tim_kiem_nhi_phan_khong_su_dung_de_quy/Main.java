package bai_13_thuat_toan_tim_kiem.thuc_hanh.cai_dat_thuat_toan_tim_kiem_nhi_phan_khong_su_dung_de_quy;

import static bai_13_thuat_toan_tim_kiem.thuc_hanh.cai_dat_thuat_toan_tim_kiem_nhi_phan_khong_su_dung_de_quy.BinarySearch.binarySearch;
import static bai_13_thuat_toan_tim_kiem.thuc_hanh.cai_dat_thuat_toan_tim_kiem_nhi_phan_khong_su_dung_de_quy.BinarySearch.list;

public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */
    }
}
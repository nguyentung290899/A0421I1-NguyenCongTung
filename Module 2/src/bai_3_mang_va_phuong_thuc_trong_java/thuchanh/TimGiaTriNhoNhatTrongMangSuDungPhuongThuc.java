package bai_3_mang_va_phuong_thuc_trong_java.thuc_hanh;

public class TimGiaTriNhoNhatTrongMangSuDungPhuongThuc {
    public static int minValue(int[] array){
        int min = array[0];
        int index = 0;
        for (int i=0; i<array.length;i++) {
            if (min > array[i]) {
                min = array[i];
                index =i;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}

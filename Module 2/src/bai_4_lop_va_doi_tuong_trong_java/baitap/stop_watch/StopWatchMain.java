package bai_4_lop_va_doi_tuong_trong_java.bai_tap.stop_watch;

import bai_4_lop_va_doi_tuong_trong_java.bai_tap.stop_watch.StopWatch;

public class StopWatchMain {
    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
        StopWatch startWatch = new StopWatch();
        startWatch.start();
        a = StopWatch.selectionSort(a);
        for (int x : a) {
            System.out.println(x);
        }
        startWatch.stop();
        System.out.println(startWatch.getStartTime() + "+" + startWatch.getEndTime());
        System.out.println("Time: " + startWatch.getElapsedTime());

    }

}

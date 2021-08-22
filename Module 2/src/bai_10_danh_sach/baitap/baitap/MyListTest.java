package bai_10_danh_sach.bai_tap.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        MyList<Integer> myList1 = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
//      myList.clear();
        int size = myList.size();
        myList.add(2, 6);
        System.out.println("myList1: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.elements[i]);
        }
        System.out.println("size: " + size);
        System.out.println(myList.get(2));
        System.out.println(myList.indexOf(4));
        myList1 = myList.clone();
        System.out.println("myList2: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList1.elements[i]);
        }
    }
}

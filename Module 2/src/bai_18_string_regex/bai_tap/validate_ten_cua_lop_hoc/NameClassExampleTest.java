package bai_18_string_regex.bai_tap.validate_ten_cua_lop_hoc;

public class NameClassExampleTest {
    public static final String[] nameClass = new String[] { "C0318G", "M0318G", "P0323A",  "P0323M"};

    public static void main(String[] args) {
        NameClassExample nameClassExample = new NameClassExample();
        for (String name : nameClass) {
            boolean isValid = nameClassExample.validate(name);
            System.out.println("Class name is " + name +" is valid: "+ isValid);
        }
    }
}

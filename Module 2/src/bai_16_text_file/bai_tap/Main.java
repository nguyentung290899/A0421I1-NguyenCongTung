package bai_16_text_file.bai_tap;
import java.io.File;
public class Main {
    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        File file1 = new File("D:\\codegym\\moduel2\\Module2\\src\\bai_16_text_file\\bai_tap\\copy_file_text\\SourceFile.txt");
        File file2 = new File("D:\\codegym\\moduel2\\Module2\\src\\bai_16_text_file\\bai_tap\\copy_file_text\\TargetFile.txt");
        copyFile.copyFileText(file1,file2);
    }
}

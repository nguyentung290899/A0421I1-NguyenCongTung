package bai_16_text_file.bai_tap;

public class CopyFile {
    private int count =0;
    public void copyFileText(File sourceFile, File targetFile) {
        String temp = "";
        int character;
        try {
            FileReader fileReader = new FileReader(sourceFile);
            if (!sourceFile.exists()) {
                System.out.println("file does not exist");
            }
            while ((character = fileReader.read())!= -1) {
                temp += (char) character;
                count++;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile));
            bufferedWriter.write(temp);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}

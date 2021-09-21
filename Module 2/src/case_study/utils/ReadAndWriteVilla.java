package case_study.utils;

import case_study.models.Room;
import case_study.models.Villa;

import java.io.*;
import java.util.Map;

public class ReadAndWriteVilla {
    public static void write(Map<Villa, Integer> roomIntegerMap, String address ) {
        File file = new File(address);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(roomIntegerMap);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static Object read(String address) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Object object = null;
        try {
            fileInputStream = new FileInputStream(address);
            objectInputStream = new ObjectInputStream(fileInputStream);
            object = objectInputStream.readObject();
            return object;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

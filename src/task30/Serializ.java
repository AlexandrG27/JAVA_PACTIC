package ru.mirea.task30;

import java.io.*;

public class Serializ implements Serializable {



    public static void save () throws Exception
    {
        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(main.tableOrder);
        objectOutputStream.close();
    }

    public static TableOrder openSave() throws Exception
    {
        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        TableOrder tb = (TableOrder) objectInputStream.readObject();
        objectInputStream.close();
        return tb;
    }
}
package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {


        FileInputStream fis = null;
        try {
            fis = new FileInputStream("data.txt");
            // code to process the file
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null)
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}

package com.company.input;

import java.io.*;

public class FilesTester {
    public static void main(String[] args) {
        File data = new File ("myfile.txt");
        int wordCount = 0;

        System.out.println(data.getAbsolutePath());

        try(BufferedReader buffer = new BufferedReader(new FileReader(data))) {
            String line;
            while ((line = buffer.readLine()) !=null);
            {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(data, true))) {
            String line = "writing a line 1";
            buffer.newLine();
            buffer.write(line);
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("The text contains "+wordCount+" ");



    }
}

package learn_exception;

import java.io.*;

public class Test {
    public static void main(String[] ar){
        String filePath = "/home/sarouarhossain/Documents/skillup/skillup/algo_data/src/main/java/learn_exception/abcdef.txt";

        StringBuilder fileData = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fileReader);

            String currentString;
            currentString = reader.readLine();
            while (currentString != null){
                fileData.append(currentString).append("\n");
                currentString = reader.readLine();
            }
            reader.close();
            fileReader.close();

            System.out.println(fileData.toString());
        }catch (IOException e){
            System.out.println("File not found: "+e.getMessage());
        }
    }
}

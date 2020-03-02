package exception;

import java.io.*;

public class Cexception {
    public static void main(String[] a){
        Writer pw = null;
        try {
             pw = new PrintWriter("abc.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            try {
                pw = new PrintWriter("def.txt","UTF-8");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
        }

        if (pw != null){
            try {
                pw.append("hell11o");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

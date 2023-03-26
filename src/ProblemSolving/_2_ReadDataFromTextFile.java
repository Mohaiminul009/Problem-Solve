package ProblemSolving;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _2_ReadDataFromTextFile {
    public static void main(String[] args) throws FileNotFoundException{
        FileReader fr = new FileReader("C:\\Users\\MOSHI\\Documents\\test.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;
        try {
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException ex) {
            Logger.getLogger(_2_ReadDataFromTextFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

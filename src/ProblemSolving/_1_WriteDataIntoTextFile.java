package ProblemSolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _1_WriteDataIntoTextFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\MOSHI\\Documents\\test.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("text1 ");
            bw.write("text2 ");
            bw.write("text3 ");
            bw.write("text4 ");
            bw.append('x');
            bw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(_1_WriteDataIntoTextFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

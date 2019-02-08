package execption.checked_exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOException {
    public static void main(String [] args){
        try {
            FileReader fileReader = new FileReader("D:/CartonLabel.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            try {
                StringBuffer sb = new StringBuffer(bufferedReader.read());
                for (int i=0;i<sb.length();i++){
                    System.out.println(sb);
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//IOException is coming at compile time that as known checked exception
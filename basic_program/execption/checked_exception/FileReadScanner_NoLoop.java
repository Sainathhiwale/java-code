package execption.checked_exception;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReadScanner_NoLoop {
    public static void main(String [] args){
        try {
            File file = new File("D:\\test\\file.txt");
            Scanner sc = new Scanner(file);
            sc.useDelimiter("\\Z");
            System.out.println(sc.nextLine());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

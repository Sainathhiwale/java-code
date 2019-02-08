package execption.checked_exception;

import java.io.FileReader;

public class FileRead_FileReader {
    public static void main(String [] args){
        try {
            FileReader fr = new FileReader("D:\\test\\file.txt");
            int i;
            while ((i=fr.read())!=-1){
                System.out.print((char)i); //casting the int values into charactoters
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

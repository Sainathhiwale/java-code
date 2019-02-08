package execption.checked_exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String []args){
        try {
            File file = new File("D:\\test\\file.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            boolean exist = file.exists();
            if (exist == true )
                while ((str = br.readLine()) != null) {
                    System.out.println(str);
                }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("clean the code ");
            //file.close();
        }

    }
}

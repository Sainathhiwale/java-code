package execption.checked_exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String [] args){
        File file = new File("D:\\test\\file.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            while ((str =br.readLine())!=null){
                System.out.println(str);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
/*Here are some of the many ways of reading files:

Using BufferedReader: This method reads text from a character-input stream. It does buffering for efficient reading of characters, arrays, and lines.
The buffer size may be specified, or the default size may be used. The default is large enough for most purposes.
In general, each read request made of a Reader causes a corresponding read request to be made of the underlying character or byte stream. It is therefore advisable to wrap a BufferedReader around any Reader whose read() operations may be costly, such as FileReaders and InputStreamReaders. For example,

BufferedReader in = new BufferedReader(Reader in, int size);*/


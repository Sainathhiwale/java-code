package file_input_output;

import java.io.*;
import java.util.Scanner;

public class ReadFiles {
    public static void main(String[] args) {
        int choice;
        String txt = "book.txt";
        File file2 = null;
        String path = "C:\\Users\\Sainath Hiwale\\Desktop\\" + txt;
        File file = new File("C:\\Users\\Sainath Hiwale\\Desktop\\ubereats.txt");
        System.out.println("enter your choices");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                if (file.exists()) {
                    try {
                        String readData = null;
                        BufferedReader br = new BufferedReader(new FileReader(file));
                        readData = br.readLine();
                        System.out.println("DATA:" + readData);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (file.length() == 0) {
                    System.out.println("file is empty!");
                }
            case 2:
                file2 = new File(path);
                if (file2.exists()) {
                    System.out.println("File already created");
                } else {
                    try {
                        file2.createNewFile();
                        System.out.println("file is created" + path);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 3:
                    try {
                        FileWriter writer = new FileWriter(path);
                        System.out.println("enter the txt");
                        String enterData = scanner.next();
                        writer.write(enterData);
                        writer.flush();
                        System.out.println("Write Data:"+enterData);
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                break;
            case 4:
                System.out.println("files Deleted!");
                break;

            default:
                System.out.println("default");
        }

    }
}


/*
*          File file = new File("C:\\Users\\Sainath Hiwale\\Desktop\\ubereats.txt");
             if (file.exists()){
           try {
               String readData=null;
               BufferedReader br = new BufferedReader(new FileReader(file));
               readData = br.readLine();
               System.out.println("DATA:"+readData);
           } catch (FileNotFoundException e) {
               e.printStackTrace();
           } catch (IOException e) {
               e.printStackTrace();
           }

        }else if (file.length()==0){
            System.out.println("file is empty!");
        }
    }*/
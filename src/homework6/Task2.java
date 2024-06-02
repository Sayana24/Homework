package homework6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void writeInFile(String str){
        try (FileOutputStream fos = new FileOutputStream("tms.txt")) {
            byte[] buffer = str.getBytes();
            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        } catch (IOException ex) {
            System.out.println("NOOO");
            System.out.println(ex.getMessage());
        }
    }
    public static void readFromFileWithCorr(String file){
        String s = "";
        try(FileInputStream fin=new FileInputStream(file))
        {
            int i;
            while((i=fin.read())!=-1){
                s += (char)i;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        s = s.replace(" ", "_");
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        writeInFile(str);

        readFromFileWithCorr("tms.txt");
    }
}

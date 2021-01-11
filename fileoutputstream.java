import java.io.*;

public class fileoutputstream{
    public static void main(String args[])throws Exception{
        FileOutputStream fileOutputStream=new FileOutputStream("jujunum.txt");

        fileOutputStream.write(97);
        fileOutputStream.close();
    }
}
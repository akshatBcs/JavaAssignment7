import java.io.*;

public class file {
    public static void main(String args[])throws Exception{
        File file=new File("jujufile.txt");
        if(file.createNewFile()){
            System.out.println("success");
        }
    }
}

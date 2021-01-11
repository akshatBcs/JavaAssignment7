import java.io.*;

public class deleTe {
    public static void main(String args[])throws Exception{
        File file=new File("jujufile.txt");
        if(file.createNewFile()){
            System.out.println("created");
        }
        if(file.delete()){
            System.out.println("success");
        }
        else {
            System.out.println("failed");
        }

    }
}

import java.io.*;

public class sizepath {
    public static void main(String args[])throws Exception{
        File file=new File("juju.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());

    }
}

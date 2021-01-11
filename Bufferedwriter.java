import java.io.*;

public class Bufferedwriter {
    public static void main (String args[]) throws Exception{
        FileWriter fileWriter=new FileWriter("juju.txt");
        BufferedWriter bufferedwriter=new BufferedWriter(fileWriter);
        bufferedwriter.write("Hello world");
        bufferedwriter.close();

         }
}

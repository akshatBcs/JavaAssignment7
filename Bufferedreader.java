import java.io.*;

public class Bufferedreader {
    public static void main (String args[]) throws Exception{
        FileReader fileReader=new FileReader("juju.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        int i;
        while ((i=bufferedReader.read())!=-1){
            System.out.print((char)i);
        }
        bufferedReader.close();
        fileReader.close();
    }
}

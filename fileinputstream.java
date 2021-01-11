import java.io.FileInputStream;

public class fileinputstream {
    public static void main(String args[])throws Exception{
        FileInputStream fileInputStream=new FileInputStream("juju.txt");
        int i;
        while((i=fileInputStream.read())!=-1){
            System.out.print((char)i);

        }

        fileInputStream.close();
    }
}

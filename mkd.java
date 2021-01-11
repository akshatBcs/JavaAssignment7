import java.io.*;

public class mkd {
    public static void main(String args[]) throws Exception {
        File file = new File("dir");
        if (file.mkdir()) {
            System.out.println("success");
        }
        else {
            System.out.println("failed");
        }
    }
}

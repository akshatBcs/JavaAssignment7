import java.io.*;

public class fiLecopy {
    public static void main(String[] args) {
        try {
            FileReader filereader = new FileReader("juju.txt");
            BufferedReader br = new BufferedReader(filereader);
            FileWriter filewriter = new FileWriter("output.txt", true);
            String s;
            while ((s = br.readLine()) != null) { 
                filewriter.write(s); 
                filewriter.flush();
            }
            br.close();
            filewriter.close();
            System.out.println("file copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
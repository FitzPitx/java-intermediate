package co.filereader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\afnjk\\Desktop\\projects-codeacademy\\java_intermediate\\src\\main\\java\\co\\filereader\\hello.txt";
        FileReader reader = new FileReader(path);
        int data = 0;

//        while ((data = reader.read()) != -1){
//            System.out.print((char) data);
//        }

        while (reader.ready()) {
            System.out.print((char) reader.read());
        }


        reader.close();
    }


}

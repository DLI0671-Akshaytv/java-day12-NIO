package nio_programs;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFilesIntoString {
    public static void main(String[] args) {
        try{
            Path path= Paths.get("demo2.txt");
            String content= Files.readString(path);
            System.out.println(content);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

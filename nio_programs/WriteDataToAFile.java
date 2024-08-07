package nio_programs;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteDataToAFile {
    public static void main(String[] args) {
        try{
            List<String> lines= new ArrayList<>();
            lines.add("Akshay Raj");
            lines.add("Thattaravalappil House");
            lines.add("Edappal");
            Path path= Paths.get("demo2.txt");
            Files.write(path,lines, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            System.out.println("Content successfully written into "+path);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

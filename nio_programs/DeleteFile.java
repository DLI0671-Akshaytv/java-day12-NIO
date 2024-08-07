package nio_programs;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    public static void main(String[] args) {
        try {
            Path sourcePath = Paths.get("demo.txt");
            Files.delete(sourcePath);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

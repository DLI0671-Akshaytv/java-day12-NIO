package nio_programs;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) {
        Path sourcePath= Paths.get("demo.txt");
        Path DestinationPath= Paths.get("demo2.txt");
        try {
            Files.copy(sourcePath, DestinationPath, StandardCopyOption.REPLACE_EXISTING);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

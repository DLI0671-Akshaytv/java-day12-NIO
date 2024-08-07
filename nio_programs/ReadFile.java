package nio_programs;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("demo.txt");
            Stream<String> content = Files.lines(path);
            content.forEach(System.out::println);
//
//            List<String> contents=content.collect(Collectors.toUnmodifiableList());
//            for(String i:contents){
//                System.out.println(i);
//            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

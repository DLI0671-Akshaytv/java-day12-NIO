package nio_level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReplaceText {
    public static void main(String[] args) {
        String old="src/nio_level2/original.txt";
        String newFile="src/nio_level2/modified.txt";
        Path pathold= Paths.get(old);
        Path pathnew=Paths.get(newFile);
        String oldText="world";
        String newText="digit";
        try(BufferedReader reader= Files.newBufferedReader(pathold);
            BufferedWriter writer=Files.newBufferedWriter(pathnew);){
            String line;
            while ((line=reader.readLine())!=null){
                String modifiedline=line.replace(oldText,newText);
                writer.write(modifiedline);
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println(e);
        }

    }
}


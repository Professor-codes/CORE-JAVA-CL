package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        // CREATE NEW FILE
        File obj = new File("file.txt");
        if (obj.exists()) {
            System.out.println("File already exits!");
        } else {
            obj.createNewFile();
            System.out.println("Successfully created new file.");
        }

        // WRITE TO FILE
        FileWriter fileWrite = new FileWriter("file.txt");
        fileWrite.write("Writing content in file...");
        fileWrite.close();

        // READING TO FILE
        FileReader fileRead = new FileReader("file.txt");
        Scanner sc = new Scanner(fileRead);
        while (sc.hasNextLine()) {
            String store = sc.nextLine();
            System.out.println(store);
        }
        sc.close();
    }
}

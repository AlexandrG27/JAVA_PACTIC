package ex6.eldorado_in_console;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.stream.Stream;
public class Shop extends Application
{
    private String comp;
    static boolean count = false;
    public static CPU cpu = new CPU();
    static Shop shop = new Shop();
    static Scanner input = new Scanner(System.in);

    public static void AddPc(String comp){


            try (FileWriter writer = new FileWriter("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\shop.txt", true))
            {
                writer.write(comp);
                writer.append('\n');
            }
            catch (IOException ex)
            {
                System.out.println(ex.getMessage());
            }
    }
    public static String SearchPc(String comp) throws IOException {
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\shop.txt"));
        byte[] content = new byte[fis.available()];
        fis.read(content);
        fis.close();

        String[] lines = new String(content).split("\n");
        for (String line : lines){
            String[] words = line.split(" ");
            for (String word : words)
            {
                if (word.equalsIgnoreCase(comp))
                {

                    count=true;
                }
            }
        }
        if(count == false)
        {

        }
        count=false;
        System.out.println("\n");
        return comp;
    }
    public static Object DeletePc(String comp) throws IOException {

        Path put = Paths.get("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\shop.txt");
        Path temp = Files.createTempFile("shop", ".txt");
        Stream<String> lines = Files.lines(put);
        try (BufferedWriter writer = Files.newBufferedWriter(temp))
        {
            String finalComp = comp;
            lines
                    .filter(line -> !line.startsWith(finalComp))
                    .forEach(line ->
                    {
                        try
                        {
                            writer.write(line);
                            writer.newLine();
                        } catch (IOException e)
                        {
                            throw new RuntimeException(e);
                        }
                    });
        }
        Files.move(temp, put, StandardCopyOption.REPLACE_EXISTING);
        return comp;
    }

}

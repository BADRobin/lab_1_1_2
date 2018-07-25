package lab112;

import java.io.*;

public class ReplacementInFile {
    public static void main(String[] args){
        try (BufferedReader reader = new BufferedReader(new FileReader("User.java"));
        PrintWriter writer = new PrintWriter("User.java")) {
            reader.lines().map(s -> s.replace("public", "private")).forEach(writer :: println);
//            String line;
//            while ((line = reader.readLine())!=null){
//                writer.println(line.replace("public", "privet"));
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

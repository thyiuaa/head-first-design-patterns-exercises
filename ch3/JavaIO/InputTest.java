package ch3.JavaIO;

import java.io.*;

public class InputTest {
    static String pathToFile = "E:\\Github\\head-first-design-patterns-exercises\\ch3\\JavaIO\\test.txt";
    public static void main(String[] args) throws IOException {
        int c;

        try {
            InputStream in =
                new LowerCaseInputStream(
                    new BufferedInputStream(
                        new FileInputStream(pathToFile)));
            
            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

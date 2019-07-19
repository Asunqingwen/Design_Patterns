package main;

import DecoratorIO.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 18:00
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try{
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("./src/main/test.txt")));
            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }

            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

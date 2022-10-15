import java.io.*;
public class Prog8 {
    public static void main(String []args)throws Exception{
        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(a);
        System.out.print("Enter your name: ");
        String name = b.readLine();
        System.out.println("Hola " + name);
    }
}
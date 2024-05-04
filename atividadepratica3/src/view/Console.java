package view;
import java.util.Scanner;

public class Console {

    private static Scanner scan = new Scanner(System.in);

    public static int lerInt(){
        int value = scan.nextInt();
        // limpeza de buffer
        scan.nextLine();
        return value;
    }
    
    public static String lerStr(){
        String value = scan.nextLine();
        return value;
    }

    public static float lerFloat(){
        float value = scan.nextFloat();
        // limpeza de buffer
        scan.nextLine();
        return value;
    }
}
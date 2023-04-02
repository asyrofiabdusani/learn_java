import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class YBufferedReader {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("enter input number : ");

        // using bufferedReader
        /*
         * InputStreamReader inp = new InputStreamReader(System.in);
         * BufferedReader bf = new BufferedReader(inp);
         * int num = Integer.parseInt(bf.readLine());
         * 
         * System.out.println(num);
         * bf.close();
         */

        // using scanner
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);
        sc.close();
    }
}

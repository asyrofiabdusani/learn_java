import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class YTryFinally {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // method 1
        /*
         * int num = 0;
         * BufferedReader bf = null;
         * 
         * try {
         * InputStreamReader inp = new InputStreamReader(System.in);
         * bf = new BufferedReader(inp);
         * num = Integer.parseInt(bf.readLine());
         * System.out.println(num);
         * } finally {
         * bf.close();
         * }
         */

        // method 2
        /*
         * int num = 0;
         * BufferedReader bf = null;
         * 
         * try {
         * bf = new BufferedReader( new InputStreamReader(System.in));
         * num = Integer.parseInt(bf.readLine());
         * System.out.println(num);
         * } finally {
         * bf.close();
         * }
         */

        // method 3
        int num = 0;

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {

            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
    }
}

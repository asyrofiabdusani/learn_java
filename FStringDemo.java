/**
 * FStringDemo
 */
public class FStringDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Budi");
        sb.append("Maulana");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.insert(3, "mama");
        System.out.println(sb);
    }
}
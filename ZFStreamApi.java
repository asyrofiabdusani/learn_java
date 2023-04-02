import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ZFStreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 1, 7, 2, 5, 9, 8, 6);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // s2.forEach(n -> System.out.println(n));
        Stream<Integer> s3 = s2.map(n -> n * 2);
        // s3.forEach(n -> System.out.println(n));
        int res = s3.reduce(0, (c, e) -> c + e);
        System.out.println(res);

        // ? shortcut
        int res2 = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(res2);
    }
}

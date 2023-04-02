import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ZDCollection {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);

        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("==============");

        List<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(6);
        nums2.add(7);
        nums2.add(8);

        System.out.println(nums2.get(1));
        System.out.println("==============");

        Set<Integer> nums3 = new HashSet<Integer>();
        nums3.add(23);
        nums3.add(11);
        nums3.add(45);

        for (Integer n : nums3) {
            System.out.println(n);
        }
        System.out.println("==============");

        Set<Integer> nums4 = new TreeSet<Integer>();
        nums4.add(23);
        nums4.add(11);
        nums4.add(45);

        for (Integer n1 : nums4) {
            System.out.println(n1);
        }
        System.out.println("==============");

        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("Budi", 12);
        students.put("Iwan", 11);
        students.put("Maman", 13);
        students.put("Supri", 11);

        System.out.println(students.get("Budi"));
        for (String key : students.keySet()) {
            System.out.println(key + "=" + students.get(key));
        }
        System.out.println("==============");
        List<Integer> nums5 = Arrays.asList(4, 5, 6, 8);
        for (Integer n : nums5) {
            System.out.println(n);
        }
    }
}

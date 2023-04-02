import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }

}

class Student2 implements Comparable<Student2> {
    int age;
    String name;

    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student2 that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class ZEComparatorComparable {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(23);
        nums.add(44);
        nums.add(37);
        nums.add(18);

        Collections.sort(nums);
        System.out.println(nums);
        System.out.println("=============");

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(nums, com);
        System.out.println(nums);

        System.out.println("=============");
        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student(23, "Budi"));
        studs.add(new Student(21, "Imam"));
        studs.add(new Student(26, "Iwan"));
        studs.add(new Student(22, "Yanto"));

        Comparator<Student> com2 = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                if (i.age > j.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(studs, com2);
        for (Student student : studs) {
            System.out.println(student);
        }

        System.out.println("=============");
        List<Student2> studs2 = new ArrayList<Student2>();
        studs2.add(new Student2(23, "Budi"));
        studs2.add(new Student2(21, "Imam"));
        studs2.add(new Student2(26, "Iwan"));
        studs2.add(new Student2(22, "Yanto"));

        Collections.sort(studs2);
        for (Student2 student2 : studs2) {
            System.out.println(student2);
        }
    }
}

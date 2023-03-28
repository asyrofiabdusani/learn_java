public class EArrayDemo {
    public static void main(String[] args) {
        int nums[] = { 4, 9, 1, 4 };

        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        // }

        for (int i : nums) {
            System.out.println(i);
        }

        System.out.println("====================");

        int multiArray[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                int random = (int) (Math.random() * 100);
                multiArray[i][j] = random;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println("");
        }

        // ? jagged array
        int jaggedArray[][] = new int[3][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[2];

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                int random = (int) (Math.random() * 100);
                multiArray[i][j] = random;
            }
        }
        for (int i[] : jaggedArray) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        // =================
        Student s1 = new Student();
        s1.name = "Budi";
        s1.age = 12;
        s1.address = "Jakarta";
        Student s2 = new Student();
        s2.name = "Nina";
        s2.age = 14;
        s2.address = "Bandung";
        Student s3 = new Student();
        s3.name = "Luli";
        s3.age = 13;
        s3.address = "Semarang";

        Student Students[] = new Student[3];
        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;

        System.out.println(s1.age);

        System.out.println("==============");
        for (Student s : Students) {
            System.out.println(s.name);

        }
    }
}

class Student {
    String name;
    int age;
    String address;

}

class Person {
    private String name = "John";
    private int age = 12;
    private String Address = "Jakarta";

    public Person() { // constructor
        name = "Doe";
        age = 50;
        Address = "Semarang";
    }

    public Person(String name, int age, String address) { // parameterize constructor
        this.name = name;
        this.age = age;
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}

/**
 * HEncapsulationDemo
 */
public class HEncapsulationDemo {

    public static void main(String[] args) {
        Person person = new Person();
        String name = person.getName();
        int age = person.getAge();
        String address = person.getAddress();
        System.out.println(name + " " + age + " " + address);

        person.setName("Awal");
        person.setAge(23);
        person.setAddress("Bandung");
        String name2 = person.getName();
        int age2 = person.getAge();
        String address2 = person.getAddress();
        System.out.println(name2 + " " + age2 + " " + address2);
    }
}
public class MAbstract {
    public static void main(String[] args) {
        Car obj = new Honda();
        obj.drive();
        obj.playMusic();
    }
}

abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing music");
    }
}

class Honda extends Car {
    public void drive() {
        System.out.println("driving");
    }
}
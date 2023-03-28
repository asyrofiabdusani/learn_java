class AHello {
    public static void main(String a[]) {
        int numb1 = 2;
        int numb2 = 4;
        int res = numb1 + numb2;

        System.out.println("Hello World!");
        System.out.println(res);

        // ==================

        byte by = 127;
        short sd = 558;
        long l = 55589l;

        float f = 5.8f;
        double doub = 5.8;

        char c = 'k';

        boolean bool = false;

        // ===================

        byte x = 127;
        int y = 5;
        byte z = 20;
        int resX;
        byte resY;

        resX = x; // conversion
        resY = (byte) y; // casting
        int resZ = x * z; // type promotion

        // ================

        int num = 2;
        num = num + 1;
        num += 1;
        num++; // post-increment => the result will get later
        ++num; // pre-increment => the reseult get instantly
    }
}
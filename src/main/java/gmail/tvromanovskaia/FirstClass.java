package gmail.tvromanovskaia;

public class FirstClass {
    public static void main(String[] args) {
        // Целочисленные типы (0- целочисленный литерал и всегда int))))

        byte aByte = 0; // 8b (2^8) -128 +127
        short aShort = 0; // 16b  (2^16) -32768 +32767
        int aInt = 0; // 32b (-2^32) /.. +2^32 -1)
        long aLong = 0; // 64b (2^64) (-2^64) .. +2^64-1)

        // Типы с плавающей точкой
        float aFloat = (float) 0.0F; // 32b
        double aDouble = 0.0; // 64b

        // Символьный тип
         char aChar = 'a'; // под капотом он является целочисленным

        // Логический тип
        boolean aboolean = true;

        String toBePrint = "Hello world";

        System.out.println(toBePrint);
    }
}
package gmail.tvromanovskaia;

import java.util.List;

public class HWMathOperations {
    public static void main(String[] args) {
        // 0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int

        int aInt = 10;
        int bInt = 3;

        double adouble = 0.3;
        double bdouble = 0.31;
        System.out.println(aInt + bInt);
        System.out.println(aInt - bInt);
        System.out.println(aInt * bInt);
        System.out.println(aInt / bInt);
        System.out.println(aInt % bInt);

        //1) применить несколько арифметических операций над int и double в одном выражении

        System.out.println(aInt + bInt - adouble);
        System.out.println(aInt + bInt * adouble);
        System.out.println((aInt + bInt) / adouble);

        // применить несколько логических операций ( < , >, >=, <= )
        if (aInt > bInt) {
            System.out.println((aInt + " больше " + bInt));
        } else
            System.out.println((aInt + " меньше " + bInt));

        if (adouble <= bdouble) {
            System.out.println((adouble + " меньше или равно " + bdouble));
        } else
            System.out.println((adouble + " больше или равно " + bdouble));

        // 4) получить переполнение при арифметической операции
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Максимальное float: " + maxFloat);

        // Переполнение
        float overflow = maxFloat * 2.0f;
        System.out.println("После переполнения: " + overflow);
        System.out.println("Это бесконечность?: " + Float.isInfinite(overflow));

        // Переполнение при сложении
        float largeSum = maxFloat + maxFloat;
        System.out.println("Сумма двух максимальных: " + largeSum);
    }
}





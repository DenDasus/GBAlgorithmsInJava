public class AlgorithmsLesson5HW {
    public static void main(String[] args) {
        //Задание 1. Возведение в степень
        //1.1 Циклический способ
        System.out.println(pow(2, 8));
        System.out.println(pow(2, -8));

        //1.2 Рекурсивный способ
        System.out.println(recPow(2, 8));
        System.out.println(recPow(2, -8));
    }

    public static double pow(int a, int b) {
        if(b == 0) {
            return 1;
        }
        int tmp = 1;
        for (int i = 0; i < Math.abs(b); i++) {
             tmp = tmp * a;
        }
        if(b < 0) {
            return (1.0 / tmp);
        }
        return tmp;
    }

    public static double recPow(int a, int b) {
        if(b == 0) {
            return 1;
        }
        if(b == 1) {
            return a;
        }
        if(b < 0) {
            return (1.0 / recPow(a, -b));
        }
        return a * recPow(a,b - 1);
    }
}

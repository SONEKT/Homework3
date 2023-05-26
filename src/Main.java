public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задание 1");
        byte b = 3;
        short s = 2;
        int i = 5;
        long l = 9;
        float f = 12.23f;
        double d = 13;
        char c = 48;
        boolean bo = true;
        System.out.println("Значение переменной byte с типом целочислительные равно " + b);
        System.out.println("Значение переменной short с типом целочислительные равно " + s);
        System.out.println("Значение переменной int с типом целочислительные равно " + i);
        System.out.println("Значение переменной long с типом целочислительные равно " + l);
        System.out.println("Значение переменной float с типом с плавающей точкой равно " + f);
        System.out.println("Значение переменной double с типом с плавающей точкой равно " + d);
        System.out.println("Значение переменной char с типом символьные равно " + c);
        System.out.println("Значение переменной boolean с типом целочислительные равно " + bo);
    }

    public static void task2(){
        System.out.println("Задание 2");
        float num1 = 27.12f;
        long num2 = 987678965549L;
        double num3 = 2.786;
        short num4 = 569;
        int num5 = -159;
        int num6 = 27897;
        byte num7 = 67;
    }

    public static void task3(){
        System.out.println("Задание 3");
        int stud = 23 + 27 + 30;
        int list = 480 / stud;
        System.out.println("На каждого ученика рассчитано " + list + " листов бумаги");
    }

    public static void task4(){
        System.out.println("Задание 4");
        int min = 32 * 10;
        int day = min * 3 *24;
        int days = day * 3;
        int month = days * 10;
        System.out.println("За 20 минут машина произвела " + min + " штук бутылок");
        System.out.println("За 1 день машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + month + " штук бутылок");
    }

    public static void task5(){
        System.out.println("Задание 5");
        int paint = 120;
        int white = 2;
        int brown = 4;
        int clas = paint / (white + brown);
        int whiteAll = clas * white;
        int brownAll = clas * brown;
        System.out.println("В школе, где " + clas + " классов, нужно " + whiteAll + " банок белой краски и " + brownAll + " банок коричневой краски");
    }

    public static void task6(){
        System.out.println("Задание 6");
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int grams = 5 * banana +  2 * milk + 2 * iceCream + 4 * egg;
        float kilo = grams / 1000f;
        System.out.println("В граммах " + grams + " в килограммах " + kilo);
    }

    public static void task7(){
        System.out.println("Задание 7");
        int weight = 7000;
        int lose1 = 250;
        int lose2 = 500;
        int way1 = weight / lose1;
        int way2 = weight / lose2;
        float middle = (way1 + way2) / 2f;
        System.out.println("При первом способе похудение понадобится " + way1 + " дней. При втором способе " + way2 + " дней. В среднем понадобится " + middle);
    }

    public static void task8(){
        System.out.println("Задание 8");
        var masha = 67760;
        var denis = 83690;
        var kristina = 76230;
        var masha1 = masha * 1.10;
        var denis1 = denis * 1.10;
        var kristina1 = kristina * 1.10;
        var mashaYear = kristina1 * 12 - kristina * 12;
        var denisYear = denis1 * 12 - denis * 12;
        var kristinaYear = kristina1 * 12 - kristina * 12;
        System.out.println("Маша теперь получает " + masha1 + " рублей. Годовой доход вырос на " + mashaYear + "рублей");
        System.out.println("Денис теперь получает " + denis1 + " рублей. Годовой доход вырос на " + denisYear + "рублей");
        System.out.println("Кристина теперь получает " + kristina1 + " рублей. Годовой доход вырос на " + kristinaYear + "рублей");
    }

}
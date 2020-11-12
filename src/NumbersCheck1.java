import java.util.Scanner;

public class NumbersCheck1 {

           // 1) является ли введенное число положительным или отрицательным.

    public static String numCheck(String num1) {
        int x = Integer.parseInt(num1);

        if (x == 0)
            System.out.println(num1);
        else {
            if (x > 0)
                return "Число положительное";
           else if (x < 0) {
                return "Число отрицательное";
                            }
           }
          return "Неизвестный формат числа ";
   }
//                    2) Является ли число простым
//
    public static void isNum(String num1) {
        int x = Integer.parseInt(num1);
        int count = 0;

        for (int i = 1; i <= x; ++i) {

            if ((x % i) == 0)  { count++; }
                                }
            if (count>2)
                    System.out.println(" Число " + x + " не простое");
            else    System.out.println(" Число " + x + " простое");

        }

                 //   3) Делится ли на 2, 5, 3, 6, 9 без остатка

    public static void numDivision(String num1) {
        int x = Integer.parseInt(num1);

        if ((x % 2) == 0)  System.out.println(x + " делится на 2");
        else System.out.println(x + " не делится на 2");
        if ((x % 5) == 0)  System.out.println(x + " делится на 5");
        else System.out.println(x + " не делится на 5");
        if ((x % 3) == 0)  System.out.println(x + " делится на 3");
        else System.out.println(x + " не делится на 3");
        if ((x % 6) == 0)  System.out.println(x + " делится на 6");
        else System.out.println(x + " не делится на 6");
        if ((x % 9) == 0)  System.out.println(x + " делится на 9");
        else System.out.println(x + " не делится на 9");

    }


    public static void main(String[] args) {

        //String num = "25";
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        System.out.println(numCheck(num));
        isNum(num);
        numDivision(num);


    }

}
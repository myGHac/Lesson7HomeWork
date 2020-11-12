import java.util.Scanner;

public class Arithmetics {


    static double add(double num1, double num2) {

        double  addResult = num1+num2;
        return addResult;
    }
    static double sub(double num1, double num2) {

        double  subResult = num1-num2;
        return subResult;
    }
    static double mul(double num1, double num2) {

        double  mulResult = num1*num2;
        return mulResult;
    }
    static double div(double num1, double num2) {
        double  divResult;
        if (num2 != 0) {

         divResult = num1/num2;
        return  divResult;
        }
        return 0;           }

    public static void main(String[] args) {

       double num5;

        System.out.println("Введите число 1: ");
        Scanner sc1 = new Scanner(System.in);
        double num1 = sc1.nextDouble();

        System.out.println("Введите число 2: ");
        Scanner sc2 = new Scanner(System.in);
        double num2 = sc2.nextDouble();

        System.out.println("Введите знак арфметической операции : ");
        Scanner sc3 = new Scanner(System.in);
       // String signs = sc3.next();

        char sign = sc3.next().charAt(0);

          if (sign == '-')  System.out.println(" Результат вычитания " + sub(num1, num2));
            else if (sign == '+') {
                System.out.println("Результат сложения " + add(num1, num2));}
                 else if (sign == '*'){ System.out.println("Результат умножения " + mul(num1, num2));  }
                    else if (sign == '/')
                     { num5 = div(num1, num2);
                    if (num5 == 0)
                       System.out.println(" Недопустимое деление на 0");
                       else
                        System.out.println(" Результат деления " + div(num1, num2));
                    }
                    else System.out.println("Неверный оператор");

//        System.out.println(" Сложение " + add(num1, num2));
//        System.out.println(" Вычитание " + sub(num1, num2));
//        System.out.println(" Умножение " + mul(num1, num2));
//        System.out.println(" Деление " + div(num1, num2));
    }
}
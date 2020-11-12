import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {

       convert();

    }
    public static void convert() {
        double sum;

        System.out.println("Введите cумму для конвертации: ");
        Scanner sc = new Scanner(System.in);
         double num = sc.nextDouble();

        System.out.println("Укажите курс: ");

        sc = new Scanner(System.in);
        double currency = sc.nextDouble();

        if (num != 0) {
            if (currency != 0)
            //convert(num, currency);
            {
                sum = num * currency;
                System.out.println("Сумма в валюте:  " + sum);
            }
        }

        //else  System.out.println("Значение не может быть пустым.");}
        //else  System.out.println("Значение не может быть пустым.");




//
    }
}

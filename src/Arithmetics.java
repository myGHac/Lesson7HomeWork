public class Arithmetics {


    static int add(int num1, int num2) {

        int  addResult = num1+num2;
        return addResult;
    }
    static int sub(int num1, int num2) {

        int  subResult = num1-num2;
        return subResult;
    }
    static int mul(int num1, int num2) {

        int  mulResult = num1*num2;
        return mulResult;
    }
    static int div(int num1, int num2) {
        int  divResult;
        if (num2 != 0) {

         divResult = num1/num2;
        return  divResult;
        }
        return 0;           }

    public static void main(String[] args) {

       int num1 = 9, num2 = 3;

        System.out.println(" Сложение " + add(num1, num2));
        System.out.println(" Вычитание " + sub(num1, num2));
        System.out.println(" Умножение " + mul(num1, num2));
        System.out.println(" Деление " + div(num1, num2));
    }
}

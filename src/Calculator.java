public class Calculator {

    public static class calculate {


        static int sumNumber(int sum1, int sum2, int sum3) {

          int  sAriph = (sum1+sum2+sum3)/3;
            return sAriph;
        }

        public static void main(String[] args) {

            int num1 = 2, num2 = 3, num3 = 7;


            int sAriph = sumNumber(num1, num2, num3);

            System.out.println(" Среднее арифметическое " + sAriph);
        }

    }
}

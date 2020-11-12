public class Calculator {

    public static class calculate {


        static int average(int num1, int num2, int num3) {

         int  averageNum = (num1+num2+num3)/3;
            return averageNum;
        }

        public static void main(String[] args) {

            int num1 = 2, num2 = 3, num3 = 7;


            int averageNum = average(num1, num2, num3);

            System.out.println(" Среднее арифметическое " + averageNum);
        }

    }
}

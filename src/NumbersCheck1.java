public class NumbersCheck1 {


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
            return "Неизвестный формат числа ";
        }
    }


    public static void main(String[] args) {

        //String num = "25";

        //System.out.println(numCheck(num));

    }

}
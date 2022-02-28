import java.util.Scanner;

public class task_11 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String str = src.nextLine();
        int str_nomber = src.nextInt();
        int number = Integer.parseInt(str);
            int result_max = Math.max(str_nomber, number);
            System.out.println("Наибольшее число из введенных: " + result_max);
            int result_min = Math.min(str_nomber,number);
            double min_d = (int) result_min;
            System.out.println("Наименьшее число из введенных: " + min_d);
    }
}

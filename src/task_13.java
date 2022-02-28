import java.util.Arrays;
import java.util.Scanner;

public class task_13 {

    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        String str = src.nextLine();
        System.out.println(str);
            String[] strArray = str.split("[^a-zA-Z]"); //vivod latinskix slov v massiv
            String joinnedString = Arrays.toString(strArray); //konvertachiya v stroky
            System.out.println(joinnedString);
        String[] count = str.split("\\s+[^a-zA-Z]"); //podschet slov
        System.out.println(count.length);
    }
}

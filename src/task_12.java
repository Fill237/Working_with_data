import java.util.Scanner;

public class task_12 {

    public static void main (String[] args){
        Scanner src = new Scanner(System.in);
        String str = src.nextLine();
        String mystr = str;
            if (mystr.contains("Java"))
                do {
                    boolean like = mystr.startsWith("I like");
                    mystr = String.valueOf(true);
                    continue;
                } while (mystr.endsWith("!!!"));
            System.out.println(str.toUpperCase());

        String str1= str.substring(7,11);
        System.out.println(str1.replace('a', 'o'));
        }
    }
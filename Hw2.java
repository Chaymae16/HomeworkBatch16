package class12;
//Create a String and print it in reverse order (Sunday → yadnuS).
public class Hw2 {
    public static void main(String[] args) {
         String day="Sunday";


        for (int i =day.length()-1;i>=0;i--) {
            System.out.print(day.charAt(i));

        }

    }
}

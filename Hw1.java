package class12;
/*Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters,
 print the character in the middle of the String.
 */

public class Hw1 {
    public static void main(String[] args) {

        String string="bye";

        if (!string.isEmpty()){
            if (string.length()%2!=0 && string.length()>=3){
                System.out.println(string.charAt(1));
            }
        }

    }
}

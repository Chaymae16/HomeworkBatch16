package class12;

import java.util.Scanner;

/*Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
 */
public class Hw3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter mom's first name");
        String mom=scanner.next();
        System.out.println("Enter dad's first name ");
        String dad=scanner.next();
        System.out.println("Enter gender");
        String gender=scanner.next();
        String babyName;
        if(gender.equalsIgnoreCase("boy")){
            babyName=(dad.substring(0,3)+mom.substring(mom.length()-2));
            System.out.println("Suggested baby name: "+babyName);
        } else if (gender.equalsIgnoreCase("girl")) {
            babyName=(mom.substring(0,2)+dad.substring(dad.length()-3));
            System.out.println("Suggested baby name: "+babyName);
        }


    }
}

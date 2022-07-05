
package exercise_6.pkg1;

import java.util.Scanner;

/**
 * (Math: pentagonal numbers) A pentagonal number is defined as 
 * n(3n−1)/2n(3n−1)/2 for n=1, 2,n=1, 2, …, and so on. 
 * Therefore, the first few numbers are 1, 5, 12, 22, ... . 
 * Write a method with the following header that returns a pentagonal number:
 * @author alexjasper
 */
public class Exercise_61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("The pentagonal number value for " + number + " "
                + "is " + (getPentagonalNumber(number)));
    }
    
public static int getPentagonalNumber(int n){
    int a = n;
    
    int solution = (a*((3*a) - 1))/2;
    
    return solution;
}
    
}


import java.util.Scanner;
public class IT24101474Lab6Q2B {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers:");
        int[] numbers = new int[10];
       
        
        for(int i=0; i<10; i++){
            
            System.out.println("Enter Number"+(i+1) +":");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The numbers you entered are:");

        int index=0;
        while(index<10){
            System.out.print(numbers[index] + " ");
            index++;
        }
        System.out.println();

        scanner.close();
    }
}
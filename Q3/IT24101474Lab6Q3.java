import java.util.Scanner;

public class IT24101474Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sumOfSquares = 0; 
        int count = 0; 
        
        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            int number = scanner.nextInt(); 
            
            if (number == -99) {
                break; 
            }
            
            if (number < 0) {
                System.out.println("Please enter a positive integer or -99 to terminate");
                continue; 
            }
            
            sumOfSquares += Math.pow(number, 2);
            count++; 
        }

     
        if (count == 0) {
            System.out.println("No valid numbers were entered.");
        } else {
            
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        }

        scanner.close(); 
    }
}

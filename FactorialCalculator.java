import java.util.Scanner;

public class FactorialCalculator {

   
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int n = -1;  // Initialize to an invalid value
        
      
        while (n < 0) {
            System.out.print("Enter a non-negative integer: ");
        
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
               
                if (n < 0) {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a non-negative integer.");
                scanner.next();  
            }
        }
        return n;
    }

  
    public static long calculateFactorial(int n) {
     
        if (n == 0) {
            return 1;
        }

        long factorial = 1;
       
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
    
        int number = getNonNegativeInteger();
        
   
        long result = calculateFactorial(number);

     
        System.out.println("The factorial of " + number + " is: " + result);
    }
}

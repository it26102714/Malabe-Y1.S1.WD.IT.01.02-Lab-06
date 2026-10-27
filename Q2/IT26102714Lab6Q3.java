import java.util.Scanner;
public class IT26102714Lab6Q3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		
		
	int number;
	int count = 0;
	double sumSquares = 0;
	
	
	System.out.println("Enter positive integers (terminate input with -99): ");
	
	
	while (true){
	    System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if (number == -99){
		    break;
		}	
		
		if (number < 0){
		    System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
			continue;
		}
		
		sumSquares += (double) number * number;
		count++;
	}
	
	if (count > 0){
	    double rms = Math.sqrt(sumSquares / count);
		System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
	} else{
        System.out.println("No numbers were entered.");
    }
	}
}

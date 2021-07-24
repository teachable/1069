 
import java.util.Scanner; 
 
public class Challenge { 
 
	public static void main(String args[]) { 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("What is your name: "); 
		String name = scanner.next();
		
		///{ 
	 
		//start your coding here  
     
		///}   
 
                System.out.println(new StringBuilder(name).reverse().toString());
                scanner.close();
	} 
} 

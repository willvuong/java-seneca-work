import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {		
		System.out.println("Enter a string to check if it is a palindrome: ");
		Scanner scan = new Scanner(System.in);
		String saveString = scan.nextLine();
		scan.close();

		Stack stackObj = new Stack(saveString);		
		
		if (stackObj.isPalindrome()) {
			System.out.println(saveString+ " is a palindrome");
		} else {
			System.out.println(saveString+ " is not a palindrome"); 	
		}	
	}

}

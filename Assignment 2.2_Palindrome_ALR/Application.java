/**
 * 
 */
import java.util.Scanner;
import java.util.Stack;
/**
 * @author AdelineLR
 *
 */

public class Application{
	public static void main(String[] args){
		/**
		 * Instantiation of necessary variables
		 */
		Scanner scan = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		String input = new String();
		
		/**
		 * Introductory Prompt and Scanner
		 */
		System.out.println("Please Type in a word - I'll check to see if it's a Palindrome! (all lowercase): ");
			input = scan.nextLine();
		
		/**
		 * Character loop - converts the input string into an array of characters
		 */
		Character[] original = new Character[input.length()];
		for(int count = 0; count < input.length(); count++) {
				original[count] = input.charAt(count);
		}
		
		/**
		 * Push loop - converts the characters of input into Character, then pushes them one-by-one onto the stack
		 */
		for(int count = 0; count < input.length(); count++) {
			stack.push(original[count]);
		}
		
		/**
		 * Pop loop - removes the characters on the stack onto the reversed string, creating a string with the characters in a reversed order compared to the input
		 */
		Character[] reversed = new Character[input.length()];
		
		for(int count = 0; count < input.length(); count++) {
			reversed[count] = stack.pop();
		}
		
		/**
		 * Boolean Comparison - Variable Instantiation
		 */
		
		boolean result = true;
		int count = 0;
		
		/**
		 * Boolean Comparison Loop - returns a statement based on whether the original array equals reversed, thus proving whether the input is a Palindrome
		 */
		
		while(result == true && count < input.length()) {
			if(original[count] != reversed[count] && original[count] != ' ' && reversed[count] != ' ') {
				result = false;
				System.out.println("This is not a Palindrome!");
			}
			count++;
			
			if(count == input.length()) {
				System.out.println("This is a Palindrome!");
			}
		}
			
	
		/**
		 * Scanner closing
		 */
		scan.close();
		
	}
}
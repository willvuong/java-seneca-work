public class Stack {
	private char[] input;
	private int inputLength;
		
	public Stack(String tempInput) {
		input = tempInput.toCharArray();
		inputLength = tempInput.length();
	}
	
	public Stack(int i) { //creating new char[] for comparison
		input = new char[i];
		inputLength = 0;
	}
	
	public void push(char c) { //null -> l[0], ll[1], llo[2], llop[3] (new created obj(s))
		this.input[inputLength] = c;
		++inputLength;
	}
	
	public char pop() { //poll[3] -> pol[2], po[1], p[0], null (current obj/user input)
		--inputLength;
		return input[inputLength];
	}
	
	public boolean isEmpty() {
		return inputLength == 0;
	}
	
	public boolean isPalindrome() {
		Stack s = new Stack(this.inputLength);
		String str = new String(input);
		
		while (!isEmpty()) {
			s.push(this.pop());
		}
		return str.equals(new String(s.input));
	}
	
	/*public String isPalindrome(String tempString) {
		char ca[] = tempString.toCharArray();
		int front = 0;
		int back = ca.length - 1;
		
		while(back > front) {
			if (ca[front] != ca[back]) {
				return " is not a palindrome";
			} else {
				++front;
				--back;
			}
		}
		return " is a palindrome";
	}*/

}

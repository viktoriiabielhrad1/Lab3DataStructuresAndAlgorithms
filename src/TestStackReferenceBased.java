
import java.io.*;
import java.util.*;

public class TestStackReferenceBased {
	public static boolean isBalanced(String s) {
		StackReferenceBased stack = new StackReferenceBased();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{') {
            	stack.push('{');
            }
            else if (s.charAt(i) == '}') {
            	if (stack.isEmpty()==true) {
            		return false;
            	}
            	else {
            		stack.pop();
            	}
            }
        }//end of for loop
        return stack.isEmpty();
	}//end of isBalanced


public static void main (String [] args) {
		StackReferenceBased stack = new StackReferenceBased();
		Scanner in = new Scanner(System.in);
		int choice = 0;
		while (choice != 6) {
			System.out.println("\nWelcome to StackTest! Please select a number from the list.");
		    System.out.println("1. Push a string on to the stack");
		    System.out.println("2. Pop a string from the stack");
		    System.out.println("3. Peek at the top of the stack");
		    System.out.println("4. Empty the stack");
		    System.out.println("5. Check if a string has balanced brackets.");
		    System.out.println("6. Quit the program");
		    
		    choice = in.nextInt();
		    in.nextLine();
		    if (choice == 1) {
		    	System.out.print("Enter a string to push: ");
		    	String input = in.nextLine();
		    	stack.push(input);
		    }
		    else if (choice == 2) {
		    	try {
		    		Object poppedString = stack.pop();
		    		System.out.println(poppedString + " - popped");
		    	}
		    	catch(StackException e) {
		    		System.out.println("Cannot pop");
		    	}
		    }
		    else if (choice == 3) {
		    	try {
		    		Object peekString = stack.peek();
		    		System.out.println(peekString + "- at the top of the stack");
		    	}
		    	catch (StackException e){
		    		System.out.println("Cannot peek");
		    	}
		    }
		    else if(choice == 4) {
		    	stack.popAll();
		    	System.out.println("Stack is empty!");
		    }
		    else if (choice == 5) {
		    	System.out.print("Enter a string to check for balanced brackets: ");
		        String inputString = in.nextLine();
		        if(isBalanced(inputString)) {
		        	System.out.println("The string has balanced brackets");
		        }
		        else {
		        	System.out.println("The string doesnt have balanced brackets");

		        }
		    }
		    else if (choice == 6) {
		    	System.out.println("Quitting the program.");
		    }
		    else {
		    	System.out.println("Invalid number. please select from 1-6");
		    }
		    if (choice >= 1 && choice <=4) {
		    	System.out.println("Current stack contents:");
		    	stack.displayStack();
		    }
		    	
		}//end of while loop
		in.close();
	}//end of main method

}

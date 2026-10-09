


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
	

}

package dsapractice;

public class ValidPalindrome {

	public static boolean isPalindrome(String s) {
		StringBuilder clean = new StringBuilder();
		for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                clean.append(Character.toLowerCase(c));
            }
        }
		String str = clean.toString();
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            
        	if(str.charAt(left) != str.charAt(right)) {
        		return false;
        	}
        	
        
            left++;
            right--;
        }
        
        
        return true;
    }
	
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // Should print true
        System.out.println(isPalindrome("hello"));   // Should print false
    }

}

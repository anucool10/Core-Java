package dsapractice;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }        
        
        int[] count = new int[26];
        
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; 
            count[t.charAt(i) - 'a']--; 
        }
        
       
        for (int c : count) {
            if (c != 0) {
                return false; 
            }
        }
        
        return true; 
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "anagram";
        String t1 = "nagaram";
        
        String s2 = "rat";
        String t2 = "car";
        
        System.out.println("Is \"" + s1 + "\" and \"" + t1 + "\" an anagram? " + isAnagram(s1, t1)); // Should print true
        System.out.println("Is \"" + s2 + "\" and \"" + t2 + "\" an anagram? " + isAnagram(s2, t2)); // Should print false
    }
}

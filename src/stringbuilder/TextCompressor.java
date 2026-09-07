package stringbuilder;

public class TextCompressor {

	public static String compressString(String str) {
		if(str==null || str.isEmpty()) {
			return "";
			
	}
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		for(int i=0; i<str.length();i++) {
			countConsecutive++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
                
			}
				
			}
		
		
		
	return compressed.toString();
}
	public static void main(String[] args) {
        String test1 = "aabcccccaaa";
        String test2 = "abcd";
        
        System.out.println("Original: " + test1 + " -> Compressed: " + compressString(test1)); 
        // Expected: a2b1c5a3
        
        System.out.println("Original: " + test2 + " -> Compressed: " + compressString(test2)); 
        // Expected: a1b1c1d1
    }
}

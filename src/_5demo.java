public class _5demo {
	public static void main(String args[]){
		String s_1 = "aabccccaaa";
		String s_2 = "abcd";
		String s_3 = "aabcccccd";
		System.out.println("Method compressString");
		System.out.println("s_1 = " + s_1);
		System.out.println(compressString(s_1));
		System.out.println("s_2 = " + s_2);
		System.out.println(compressString(s_2));
		System.out.println("s_3 = " + s_3);
		System.out.println(compressString(s_3));
	}
	public static String compressString(String str){
		String oldStr = str;
		String newStr = "";
		int count = 1;
		
		for(int i=0; i<oldStr.length(); i++){
			if(i+1 <= str.length()-1) { // There is the next character
				if(oldStr.charAt(i) == oldStr.charAt(i+1) ) {
					count++;
					continue;
				}
				newStr = newStr + oldStr.charAt(i) + String.valueOf(count);
				count = 1; // reset for the next character
			}
			else { // We have reached the very last character
				newStr = newStr + oldStr.charAt(i) + String.valueOf(count);
				count = 1; // reset for the next character
			}
		}
		
		if (newStr.length() <= oldStr.length()) return newStr;
		else return oldStr;
	}
}

public class _8demo {
	public static void main(String args[]){
		String s_1 = "waterbottle";
		String s_2 = "erbottlewat"; // Yes they are rotations
		
		String s_3 = "differentiate";
		String s_4 = "rent"; // They are just substrings
		
		String s_5 = "hello";
		String s_6 = "world"; // They are not substrings, and they are not rotations
		
		String s_7 = "computer";
		String s_8 = "computer"; // They are identical
		
		System.out.println("Method isRotation");
		System.out.println("s_1 is: " + s_1 + " and s_2 is: " + s_2);
		System.out.println("isRotation? " + isRotation(s_1, s_2));
		System.out.println();
		System.out.println("s_3 is: " + s_3 + " and s_4 is: " + s_4);
		System.out.println("isRotation? " + isRotation(s_3, s_4));
		System.out.println();
		System.out.println("s_5 is: " + s_5 + " and s_6 is: " + s_6);
		System.out.println("isRotation? " + isRotation(s_5, s_6));
		System.out.println();
		System.out.println("s_7 is: " + s_7 + " and s_8 is: " + s_8);
		System.out.println("isRotation? " + isRotation(s_7, s_8));
	}
	
	public static boolean isSubstring(String s1, String s2){ // given
		if(s1.contains(s2)) return true;
		return false;
	}
	
	public static boolean isRotation(String s1, String s2) {
		if(isSubstring(s1, s2) && isSubstring(s2, s1)) return false; // They are identical, and they are not rotations 
		
		if(s1.length() != s2.length()) return false; // They are definitely not rotations
		
		String newStr = s1+s1;
		
		if(isSubstring(newStr, s2)) return true;
		
		return false;
	}
}

import java.util.HashMap;

public class _1demo {
	public static void main(String[] args) {
		String s_1 = "What is up?";
		String s_2 = "Hello";
		String s_3 = "World";
		System.out.println("isUniqueChars Method");
		System.out.println(" 'What is up?' is unique chars?: " + isUniqueChars(s_1));
		System.out.println(" 'Hello' is unique chars?: " + isUniqueChars(s_2));
		System.out.println(" 'World' is unique chars?: " + isUniqueChars(s_3));
		System.out.println("");
		System.out.println("isUniqueChars_2 Method");
		System.out.println(" 'What is up?' is unique chars?: " + isUniqueChars_2(s_1));
		System.out.println(" 'Hello' is unique chars?: " + isUniqueChars_2(s_2));
		System.out.println(" 'World' is unique chars?: " + isUniqueChars_2(s_3));
	}
	
	public static boolean isUniqueChars(String str) { // space = O(1) and time = o(n)
		if(str.length()>256) return false;
		boolean[] char_set = new boolean[256]; // When first declare an empty array of type boolean, each index stores "false" automatically
		for (int i = 0; i < str.length(); i++){
			int val = str.charAt(i);
			if(char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
	public static boolean isUniqueChars_2(String str) {
		if(str.length() <= 0) return false;
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>(); // When first declare a hash map storing boolean values, when a key associated with it is not in the map yet, the value is "null" automatically
		for(int i=0; i<str.length(); i++){
			if(map.get(str.charAt(i))== null) map.put(str.charAt(i), true);
			else if(map.get(str.charAt(i))) return false;
		}
		return true;
	}
}

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Hashtable;

public class isUniqueCharacter{
	public static boolean isUniqueHashtable(String str){
		// Time: O(n), Space: O(1)
		Hashtable<Character, Boolean> table=new Hashtable<Character, Boolean>();
		if(str.length()==0 || str.length()==1) return true;
		else if(str.length()>=256) return false;
		for(int i=0; i<str.length(); i++){
			if(table.containsKey(str.charAt(i))) return false;
			else{
				table.put(str.charAt(i), true);
			}
		}
		return true;
	}
	
	public static boolean isUniqueArray(String str){
		// Time: O(n), Space: O(1)
		if(str.length()<=1) return true;
		else if(str.length()>256) return false;
		Character[] characters=new Character[256];
		int val;
		for(int i=0; i<str.length(); i++){
			val=str.charAt(i);
			if(characters[val]==null) characters[val]=str.charAt(i);
			else return false;
		}
		return true;
	}
	
	public static boolean isUniqueSort(String str){
		// Time: O(nlog(n)), Space: O(1)
		if(str.length()<=1) return true;
		else if(str.length()>256) return false;
		char[] characters=str.toCharArray();
		Arrays.sort(characters);
		for(int i=0; i<str.length()-1; i++){
			if(characters[i]==characters[i+1]) return false;
		}
		return true;
	}
	
	public static boolean isUniqueNoAdditionalDS(String str){
		// Time: O(n^2), Space: take extra space to sort
		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<str.length(); j++){
				if(str.charAt(i)==str.charAt(j)) return false;
			}
		}
		return true;
	}

	
	// Test
	public static void main(String[] args){
		String str="Hello";
		System.out.print(isUniqueHashtable(str)+" ");
		System.out.print(isUniqueArray(str)+" ");
		System.out.print(isUniqueSort(str)+" ");
		System.out.println(isUniqueNoAdditionalDS(str));
		String str_2="";
		System.out.print(isUniqueHashtable(str_2)+" ");
		System.out.print(isUniqueArray(str_2)+" ");
		System.out.print(isUniqueSort(str_2)+" ");
		System.out.println(isUniqueNoAdditionalDS(str_2));
		String str_3="He";
		System.out.print(isUniqueHashtable(str_3)+" ");
		System.out.print(isUniqueArray(str_3)+" ");
		System.out.print(isUniqueSort(str_3)+" ");
		System.out.println(isUniqueNoAdditionalDS(str_3));
		String str_4="  ";
		System.out.print(isUniqueHashtable(str_4)+" ");
		System.out.print(isUniqueArray(str_4)+" ");
		System.out.print(isUniqueSort(str_4)+" ");
		System.out.println(isUniqueNoAdditionalDS(str_4));
	}
}



















/*import java.util.HashMap;

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
*/
public class isPermutation{
	public static boolean isPermutation(String str){
		//assume case is not sensitive
		//assume white space matters
		//TOTO
		return false;
	}
	
	//Test
	public static void main(String[] args){
		
	}
}


















/*
import java.util.HashMap;

public class _3demo {
	public static void main(String[] args){
		String s_1 = "ABCD";
		String s_2 = "DBCA";
		String s_3 = "XYZ";
		String s_4 = "WXYZ";
		String s_5 = "";
		System.out.println("isPermutation_1 Method"); 
		System.out.println("'ABCD' and 'DBCA' are permutations?: " + isPermutation_1(s_1, s_2));
		System.out.println("'ABCD' and 'XYZ' are permutations?: " + isPermutation_1(s_1, s_3));
		System.out.println("'ABCD' and 'WXYZ' are permutations?: " + isPermutation_1(s_1, s_4));
		System.out.println("'ABCD' and '' are permutations?: " + isPermutation_1(s_1, s_5));
		
		System.out.println("isPermutation_2 Method"); 
		System.out.println("'ABCD' and 'DBCA' are permutations?: " + isPermutation_2(s_1, s_2));
		System.out.println("'ABCD' and 'XYZ' are permutations?: " + isPermutation_2(s_1, s_3));
		System.out.println("'ABCD' and 'WXYZ' are permutations?: " + isPermutation_2(s_1, s_4));
		System.out.println("'ABCD' and '' are permutations?: " + isPermutation_2(s_1, s_5));
	}
	public static boolean isPermutation_1(String str_1, String str_2){ // With the assumption that all characters are unique
		if(str_1.length() != str_2.length()) return false;
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
		for(int i=0; i<str_1.length(); i++){
			if(map.get(str_1.charAt(i)) == null)
				map.put(str_1.charAt(i), true);
		}
		
		for(int j=0; j<str_2.length(); j++){
			if(map.get(str_2.charAt(j)) == null) return false; 
		}
		return true;
	}
	
	public static boolean isPermutation_2(String str_1, String str_2){ //Not all characters are unique, and use recursion to list out all permutations ans stor in a set
		return false;
	}
}
*/
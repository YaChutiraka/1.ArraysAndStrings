public class _2demo {
	public static void main(String[] args){
		String s_1 = "environmentalists";
		String s_2 = "";
		String s_3 = "a";
		System.out.println("reverse Method");
		System.out.println("'evironmentalists' in reverse?: '" + reverse(s_1) + "'");
		System.out.println("'' in reverse?: '" + reverse(s_2)+ "'");
		System.out.println("'a' in reverse?: '" + reverse(s_3) + "'");
	}
	
	public static String reverse(String str){
		if(str.length()<=1) return str;
		String newStr= "";
		for(int i=0; i<str.length(); i++){
			newStr = newStr + str.charAt(str.length()-1-i);
		}
		return newStr;
	}
}

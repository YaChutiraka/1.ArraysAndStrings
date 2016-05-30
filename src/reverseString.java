public class reverseString{
	
	public static String reverseUsingArray(String str){
		if(str.length()<=1) return str;
		else{
			char temp;
			char[]  characters=str.toCharArray();
			for(int i=0; i<str.length()/2; i++){
				temp=characters[i];
				characters[i]=characters[str.length()-1-i];
				characters[str.length()-1-i]=temp;
			}
			return String.valueOf(characters);
		}
	}
	
	public static String reverseUsingString(String str){
		if(str.length()<=1) return str;
		else{
			String newStr="";
			for(int i=str.length()-1; i>=0; i--){
				newStr=newStr+str.charAt(i);
			}
			
			return newStr;
		}
	}
	
	//Test
	public static void main(String[] args){
		String s_1 = "environmentalists";
		String s_2 = "";
		String s_3 = "a";
		String s_4 = "he";
		System.out.println("reverse Method");
		System.out.println("'evironmentalists' in reverse?: '" + reverseUsingArray(s_1) + "'" + " '"+reverseUsingString(s_1)+"'");
		System.out.println("'' in reverse?: '" + reverseUsingArray(s_2)+ "'" + " '"+reverseUsingString(s_2)+"'");
		System.out.println("'a' in reverse?: '" + reverseUsingArray(s_3) + "'" + " '"+reverseUsingString(s_3)+"'");
		System.out.println("'he' in reverse?: '" + reverseUsingArray(s_4) + "'" + " '"+reverseUsingString(s_4)+"'");
	}
}
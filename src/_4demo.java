public class _4demo {
	public static void main(String[] args){
		char[] s_1 = {'A',' ', 'B', 'C', ' ', ' ', 'D', ' ', ' ', ' ', ' ', ' ', ' '}; // A BC  D
		System.out.println("replaceSpace Method");
		System.out.println("replace Space in " + java.util.Arrays.toString(s_1) + " with %20");
		System.out.println("The result is: " + replaceSpace(s_1, 7));
	}
	public static String replaceSpace(char[] str, int length){ // The function takes "true" length of the string we want to work with. 
		int countSpace = 0;
		int oldLength = length;
		int newLength = oldLength;
		int k = 0;
		for(int i=0; i<oldLength; i++){
			if(str[i]==' ') countSpace = countSpace + 1;
		}
		newLength = newLength + (2*countSpace);
		
		for(int j=oldLength-1; j>=0; j--) {
			if(str[j] != ' ') {
				str[newLength-1-k] = str[j];
				k++;
			}
			else if (str[j] == ' ') {
				str[newLength-1-k] = '0';
				str[newLength-1-k-1] = '2';
				str[newLength-1-k-2] = '%';
				k = k+3;
			}
		}
		return java.util.Arrays.toString(str);
	}
}
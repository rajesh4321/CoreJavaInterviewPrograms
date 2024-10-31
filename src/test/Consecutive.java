package test;

public class Consecutive {

	
	public static void main(String[] args) {
		String str = "ABCDDEFEFGGH";
		char[] ch = str.toCharArray();
		for(int i = 0; i<ch.length-1; i++){
	
			if(ch[i] == ch[i+1]) {
				System.out.println(ch[i]);
			}
			
		}
		
		
		
		String s = "Sachin";
		String s1 = "Sachin";
		String s2 = new String("Sachin");
		
		System.out.println(s==s1);
		System.out.println(s==s2);
	}
}

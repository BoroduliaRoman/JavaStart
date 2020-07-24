package ua.com.localhost.stringmanipulation;

public class StringUtil {

	public static void main(String[] args) {
		
		String source = "Hello my beautiful world!";

		String[] words = source.split(" ");
		
		System.out.println("ֲ פנאחו (" + source +  ") סעמכüךמ סכמג: " + words.length);
		
		for(int i = 0; i < words.length; i++) {
			System.out.print("ֲ סכמגו: " + words[i]);

			char[] letters = words[i].toCharArray();
			System.out.print(" " + letters.length + " סטלגמכמג \n ");
		}
	}
}
package ua.com.localhost.stringmanipulation;

public class StringUtil {

	public static void main(String[] args) {
		
		String source = "Hello my beautiful world!";

		String[] words = source.split(" ");
		
		System.out.println("� ����� (" + source +  ") ������� ����: " + words.length);
		
		for(int i = 0; i < words.length; i++) {
			System.out.print("� �����: " + words[i]);

			char[] letters = words[i].toCharArray();
			System.out.print(" " + letters.length + " �������� \n ");
		}
	}
}
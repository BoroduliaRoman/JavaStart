package ua.com.localhost.helloworld;

public class HelloWorld {
	
	public static void main(String[] args) {
		String message = "Hello world!";
		int i = 6;
		int j = 7;
		float answer = i / j;
		
		String stringAnswer = answer + " " + message;
		
		boolean isMoreThanOne;
		
		if(answer > 1) {
			isMoreThanOne = true;
		} else {
			isMoreThanOne = false;
		}
		
		System.out.println(message);
		System.out.println(answer);
		System.out.println(stringAnswer + isMoreThanOne);
		System.out.println(isMoreThanOne);
	}
}
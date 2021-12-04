package stringHandling;

public class StringIntro {

	public static void main(String[] args) {
		//char array

		final char[] c = {'H','e','l','l','o'};
		
		// cahrSequence char arr to string		
		String s = new String(c); 
		String s1 = s.concat(" Java");
		System.out.println(s);
		System.out.println(s1);
		
	}

}
 
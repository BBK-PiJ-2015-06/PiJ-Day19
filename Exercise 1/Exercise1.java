import java.util.Arrays;

public class Exercise1 {
	public static void main(String[] args) {
		String[] stringArray = {"Anne", "Brian", "Charlotte", "Dave", "Goodbye", "Hi"};
		
		//array sorted by length(i.e. shortest to longest)
		Arrays.sort(stringArray, (s1, s2) -> s1.length() - s2.length());
		System.out.println(Arrays.asList(stringArray));
		
		//array sorted by length(i.e. longest to shortest)
		Arrays.sort(stringArray, (s1, s2) -> s2.length() - s1.length());
		System.out.println(Arrays.asList(stringArray));
		
		//array sorted by first character
		Arrays.sort(stringArray, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		System.out.println(Arrays.asList(stringArray));
		
		//array sorted by strings containing "e"
		Arrays.sort(stringArray, (s1, s2) -> s2.indexOf('e') - s1.indexOf('e')); //indexOf(char) returns -1 if character is not present in string
		System.out.println(Arrays.asList(stringArray));
	}
}
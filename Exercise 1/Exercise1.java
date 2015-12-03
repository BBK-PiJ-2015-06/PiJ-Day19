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
	}
}
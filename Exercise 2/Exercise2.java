import java.util.Arrays;

public class Exercise2 {
	public static void main(String[] args) {
		String[] stringArray = {"Hello", "Goodbye", "Spurs", "are", "the", "best", "I", "why"};
		Arrays.sort(stringArray, StringUtils::eChecker);
		System.out.println(Arrays.asList(stringArray));
	}
}
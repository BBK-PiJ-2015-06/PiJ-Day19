import java.util.List;
import java.util.ArrayList;

public class Exercise8 {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("hello");
		myList.add("my");
		myList.add("name");
		myList.add("is");
		myList.add("george");
		myList.add("shiangoli");
		
		//adds exclamation mark!
		List<String> excitedStrings = ElementUtils.transformedList(myList, (s) -> s + "!");
		System.out.println(excitedStrings);
		
		//capitalised words
		List<String> upperCaseStrings = ElementUtils.transformedList(myList, (s) -> s.toUpperCase());
		System.out.println(upperCaseStrings);
	}
	
}
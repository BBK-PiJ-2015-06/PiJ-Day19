import java.util.List;
import java.util.ArrayList;

public class Exercise6 {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("hello");
		myList.add("my");
		myList.add("name");
		myList.add("is");
		myList.add("george");
		myList.add("shiangoli");
		
		//words in list with length less than 3
		List<String> shortStrings = ElementUtils.allMatches(myList, (s) -> s.length() <= 2);
		System.out.println(shortStrings);
		
		//words in list that contains "h"
		List<String> hStrings = ElementUtils.allMatches(myList, (s) -> s.contains("h"));
		System.out.println(hStrings);
		
		//words with even length
		List<String> evenStrings = ElementUtils.allMatches(myList, (s) -> s.length() % 2 == 0);
		System.out.println(evenStrings);
		
		//words that end in e
		List<String> eEndStrings = ElementUtils.allMatches(myList, (s) -> s.charAt(s.length() - 1) == 'e');
		System.out.println(eEndStrings);
	}
	
}
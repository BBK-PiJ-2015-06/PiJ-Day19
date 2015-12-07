import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

public class StringUtils {
	public static List<String>  allMatches(List<String> list, Predicate<String> predicate) {
		List<String> output = new ArrayList<String>();
		for(int index = 0; index < list.size(); index++) {
			if(predicate.test(list.get(index))) {
				output.add(list.get(index));
			}
		}
		return output;
	}
}	
	
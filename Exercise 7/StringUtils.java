import java.util.function.Predicate;
import java.util.function.Function;
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
	
	public static List<String> transformedList(List<String> list, Function<String,String> function) {
		List<String> output = new ArrayList<String>();
		for(String s : list) {
			output.add(function.apply(s));
		}
		return output;
	}
}	
	
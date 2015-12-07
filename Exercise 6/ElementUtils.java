import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

public class ElementUtils {
	public static <T> List<T>  allMatches(List<T> list, Predicate<T> predicate) {
		List<T> output = new ArrayList<T>();
		for(int index = 0; index < list.size(); index++) {
			if(predicate.test(list.get(index))) {
				output.add(list.get(index));
			}
		}
		return output;
	}
}	
	
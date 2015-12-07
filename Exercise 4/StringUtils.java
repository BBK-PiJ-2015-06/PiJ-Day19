public class StringUtils {
	
	public static  <T> T betterEntry(T element1, T element2, TwoElementPredicate<T> tep) {
		if(tep.isBetter(element1, element2)) {
			return element1;
		} else {
			return element2;
		}
	}
}
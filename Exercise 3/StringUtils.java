public class StringUtils {
	
	public static String betterString(String s1, String s2, TwoStringPredicate tsp) {
		if(tsp.isBetter(s1, s2)) {
			return s1;
		} else {
			return s2;
		}
	}
}
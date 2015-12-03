public class StringUtils {
	public static int eChecker(String s1, String s2) {
		int output = 0;
		if(s1.indexOf('e') >= 0 && s2.indexOf('e') < 0) {
			output = -1;
		}
		if(s1.indexOf('e') < 0 && s2.indexOf('e') >= 0) {
			output = 1;
		}
		return output;
	}
}
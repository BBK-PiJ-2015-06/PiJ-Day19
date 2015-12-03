public class Exercise3 {
	public static void main(String[] args) {
		String input1 = "Hi";
		String input2 = "World";
		
		//prints whichever is longer out of input1 and input2
		System.out.println(StringUtils.betterString(input1, input2, (s1, s2) 
		                                                    -> s1.length() > s2.length()));													
		//prints always input1
		System.out.println(StringUtils.betterString(input1, input2, (s1, s2) -> true));
		
		//prints always input2
		System.out.println(StringUtils.betterString(input1, input2, (s1, s2) -> false));
		
		//prints whichever input comes first alphabetically
		System.out.println(StringUtils.betterString(input1, input2, (s1, s2) 
		                                                    -> s1.charAt(0) < s2.charAt(0)));
	}
}
package examples;

import fun.*;

import java.util.regex.*;

public class Matches extends Fun2<Matcher,String,Boolean> {

	public Boolean apply (Matcher matcher, String in) {
		matcher.reset(in);
		return Boolean.valueOf(matcher.matches());
	}

	public static Fun<String,Boolean> matcher (String pattern) {
		return new Matches().apply(Pattern.compile(pattern).matcher(""));
	}

}

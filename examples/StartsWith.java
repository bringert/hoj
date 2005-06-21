package examples;

import fun.*;

public class StartsWith extends Fun2<String,String,Boolean> {

	public Boolean apply (String in, String pattern) {
		return Boolean.valueOf(in.startsWith(pattern));
	}

}

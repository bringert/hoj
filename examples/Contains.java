import fun.*;

public class Contains extends Fun2<String,String,Boolean> {

	public Boolean apply (String in, String pattern) {
		return Boolean.valueOf(in.indexOf(pattern) != -1);
	}

}

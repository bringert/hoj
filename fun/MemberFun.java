package fun;

import java.lang.reflect.*;

public class MemberFun<A,B> extends Fun<A,B> {

	protected String name;
	protected Class[] argTypes;

	public MemberFun (String name) {
		this.name = name;
		this.argTypes = new Class[]{};
	}

	/*
	 * Looks up method and calls it. Method lookup is done on every call
	 * so that the right version of the method is called.
	 */
	public B apply (A obj) {
		try {
			Method m = obj.getClass().getMethod(name, argTypes);
			return (B)m.invoke(obj, new Object[]{});
		} catch (NoSuchMethodException ex) {
			throw new RuntimeException(ex);
		} catch (IllegalAccessException ex) {
			throw new RuntimeException(ex);
		} catch (InvocationTargetException ex) {
			throw new RuntimeException(ex);
		}
	}

}

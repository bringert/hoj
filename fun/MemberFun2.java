package fun;

import java.lang.reflect.*;

public class MemberFun2<A,B,C> extends Fun2<A,B,C> {

	protected String name;
	protected Class[] argTypes;

	public MemberFun2 (String name, Class argType1) {
		this.name = name;
		this.argTypes = new Class[]{ argType1 };
	}

	/*
	 * Looks up method and calls it. Method lookup is done on every call
	 * so that the right version of the method is called.
	 */
	public C apply (A obj, B arg1) {
		try {
			Method m = obj.getClass().getMethod(name, argTypes);
			return (C)m.invoke(obj, new Object[]{ arg1 });
		} catch (NoSuchMethodException ex) {
			throw new RuntimeException(ex);
		} catch (IllegalAccessException ex) {
			throw new RuntimeException(ex);
		} catch (InvocationTargetException ex) {
			throw new RuntimeException(ex);
		}
	}

}

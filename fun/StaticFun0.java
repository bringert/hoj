package fun;

import java.lang.reflect.*;

public class StaticFun0<A> extends Fun0<A> {

	protected Method method;

	public StaticFun0 (Class cls, String name) {
		try {
			method = cls.getDeclaredMethod(name, new Class[]{});
			if (!Modifier.isStatic(method.getModifiers())) 
				throw new NoSuchMethodException(method +  " is not static");
		} catch (NoSuchMethodException ex) {
			throw new RuntimeException(ex);
		}
	}

	public A apply () {
		try {
			return (A)method.invoke(null, new Object[]{});
		} catch (IllegalAccessException ex) {
			throw new RuntimeException(ex);
		} catch (InvocationTargetException ex) {
			throw new RuntimeException(ex);
		}
	}

}

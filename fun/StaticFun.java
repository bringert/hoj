package fun;

import java.lang.reflect.*;

public class StaticFun<A,B> extends Fun<A,B> {

	protected Method method;

	public StaticFun (Class cls, String name, Class arg1Type) {
		try {
			method = cls.getDeclaredMethod(name, new Class[]{ arg1Type });
			if (!Modifier.isStatic(method.getModifiers())) 
				throw new NoSuchMethodException(method + " is not static");
		} catch (NoSuchMethodException ex) {
			throw new RuntimeException(ex);
		}
	}

	public B apply (A arg1) {
		try {
			return (B)method.invoke(null, new Object[]{ arg1 });
		} catch (IllegalAccessException ex) {
			throw new RuntimeException(ex);
		} catch (InvocationTargetException ex) {
			throw new RuntimeException(ex);
		}
	}

}

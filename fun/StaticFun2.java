package fun;

import java.lang.reflect.*;

public class StaticFun2<A,B,C> extends Fun2<A,B,C> {

	protected Method method;

	public StaticFun2 (Class cls, String name, Class arg1Type, 
					   Class arg2Type) {
		try {
			method = cls.getDeclaredMethod(name, new Class[]{ 
				arg1Type, arg1Type });
			if (!Modifier.isStatic(method.getModifiers())) 
				throw new NoSuchMethodException(method +  " is not static");
		} catch (NoSuchMethodException ex) {
			throw new RuntimeException(ex);
		}
	}

	public C apply (A arg1, B arg2) {
		try {
			return (C)method.invoke(null, new Object[]{ arg1, arg2 });
		} catch (IllegalAccessException ex) {
			throw new RuntimeException(ex);
		} catch (InvocationTargetException ex) {
			throw new RuntimeException(ex);
		}
	}

}

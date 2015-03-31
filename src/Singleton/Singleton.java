package Singleton;

public class Singleton
{
	private static Singleton singleton = null;

	private Singleton()
	{

	}

	/* 此处使用一个内部类来维护单例 */
	private static class SingletonFactory
	{
		private static Singleton instance = new Singleton();
	}

	/* 获取实例 */
	public static Singleton getIntance()
	{

		return Singleton.singleton;

	}

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve()
	{
		return getIntance();
	}

}

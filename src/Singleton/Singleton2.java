package Singleton;

public class Singleton2
{

	private static Singleton2 singleton2 = null;

	private Singleton2()
	{
	}

	private synchronized void sysnInit()
	{
		if (singleton2 == null)
		{
			singleton2 = new Singleton2();

		}

	}

	private Singleton2 getInstance()
	{

		if (singleton2 == null)
		{
			sysnInit();

		}
		return singleton2;

	}

}

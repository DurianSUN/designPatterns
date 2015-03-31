package FactoryMethod;

/**
 * 静态工厂方法模式
 * 
 * @author haondroid
 * 
 */
public class SendFactory3
{

	public static Sender pruduceMain()
	{
		return new MailSender();

	}

	public static Sender pruduceEms()
	{
		return new EmsSender();

	}

	public static void main(String args[])
	{
		Sender sender = SendFactory3.pruduceEms();
		sender.sender();

	}
}
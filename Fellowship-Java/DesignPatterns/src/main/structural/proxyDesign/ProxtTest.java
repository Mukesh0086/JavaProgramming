package proxyDesign;

public class ProxtTest 
{
	public static void main(String[] args) 
	{
		CommandExecutor executer=new CommandExecutorProxy("Mukesh","123");
		try 
		{
			executer.runCommand("ls-ltr");
			executer.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) 
		{
			System.out.println("Exception Message::"+e.getMessage());
		}
	}
}

import java.util.*;

public class MySingleton 
{
	private static MySingleton onlyObject = null;//placeholder for current object
	
	String[] keyLetters = {"1","1","1","2","2","2","3","3","3","4","4","4","5","5","5","6","6","6","7","7","7","8","8","8","9","9","9","0","0","0",
							"A","A","B","B","C","C","D","D","E","E","F","F","G","G","H","H","I","I","J","J","K","K","L","L","M","M","N","N","O","O",
							"P","P","Q","Q","R","R","S","S","T","T","U","U","V","V","W","W","X","X","Y","Y","Z","Z"};
	
	private LinkedList<String> letter = new LinkedList<String>(Arrays.asList(keyLetters));
	
	static boolean runningThread = true;//control run time
	
	private MySingleton()
	{
		
	}
	
	public static MySingleton getInstance()
	{
		if(onlyObject ==null)
		{
			if(runningThread == true)
			{
				runningThread = false;
				
				try 
				{
					Thread.currentThread();
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				
			}
			synchronized(MySingleton.class)
			{
				if(onlyObject == null)
				{
					onlyObject = new MySingleton();
					Collections.shuffle(onlyObject.letter);
				}
				
			}
		}
		return onlyObject;
	}
	
	public LinkedList<String> getLetterList()
	{
		return onlyObject.letter;
	}
	
	public LinkedList<String> getLine()
	{
		int limit = 8;
		LinkedList<String> returnLine = new LinkedList<String>();
		
		for(int i = 0; i < limit; i++)
		{
			returnLine.add(onlyObject.letter.remove(0));
		}
		return returnLine;
	}
}

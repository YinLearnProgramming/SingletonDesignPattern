import java.util.*;
/**
 * This program is create a password by using singleton design pattern 
 * @author YHK
 * when it comes to control access, users need password to access the application.
 * In this program, program may create thread and program will generate password for each thread.
 * In order to prevent run time problem of each thread, application take advantage of using singleton design pattern.
 */
public class SingletonDrive 
{
	public static void main(String[] args)
	{
		MySingleton instanceObject = MySingleton.getInstance();
		String myString;
		//get object ID
		System.out.println("Instance ID: " + System.identityHashCode(instanceObject));
		//shuffle check
		//System.out.println(instanceObject.getLetterList());
		LinkedList<String> line = instanceObject.getLine();//create combination of password
		//System.out.println("user : " + line);//check line
		myString = line.toString();
		myString =  myString.replaceAll(",| ", "");//remove ","
		System.out.println("user password: " + myString);
		
	}
}

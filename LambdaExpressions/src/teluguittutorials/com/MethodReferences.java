package teluguittutorials.com;
import java.util.Arrays;


import java.util.List;
public class MethodReferences {
	
	public static void saySomething()
	{
		System.out.println("Welcome to Static Method");
	}
	
	public void  printMessage(String message)
	{
		System.out.println("Message:" + message);
	}
	public static void main(String[] args) {
		
		//Reference to a static method
		//Syntax: ContainingClass::staticMethodName
		Runnable runnable=MethodReferences::saySomething;
		runnable.run();
		//Reference to an Instance method of a particular object
		//Syntax: ContainingObjet::instanceMethod
		MethodReferences obj=new MethodReferences();
		List <String> messages=Arrays.asList("Welcome","Hai","Hello");
		messages.forEach(obj::printMessage);
		
		//Reference to an instance method of any arbitrary object of particular type
		//Syntax:ContainingObject::methodName
		List<String> strings=Arrays.asList("d","a","c","b");
		strings.sort(String::compareToIgnoreCase);
		System.out.println(strings);
		
		//Reference to Constructor
		//Syntax:ClassName::new;
		
		MessageFactory factory = Message::new;
		Message msg=factory.getMessage("Hello Constructor Reference");
		System.out.println(msg.msg);
	
		
	}

}
class Message
{
	String msg;
	Message(String msg)
	{
		this.msg=msg;
	}
}

interface MessageFactory
{
	Message getMessage(String msg);
}

public class Helloworld {

	public static void main(String[] args) {
		 
		String messageString = "Hello World" + "!!!";
		
		
		System.out.println(messageString.startsWith("Hello"));
		System.out.println(messageString.endsWith("!!"));	
		
		System.out.println(messageString.length());	
		
		System.out.println(messageString.indexOf("W"));
		
		System.out.println(messageString.indexOf("w"));
		System.out.println(messageString.indexOf("sky"));
		
		System.out.println(messageString.replace("d","A"));
		System.out.println(messageString.replaceAll("!", "*") );
		
		System.out.println(messageString);
		
		System.out.println(messageString.toLowerCase());
		System.out.println(messageString.toUpperCase());
		
		
		String exampleMessageforTrim= "    Hello World For Trim      *" + "*    !!!    ";
		System.out.println(exampleMessageforTrim.trim());
		
		
		String newMessage = "Hello \"Mosh\"";
		System.out.println(newMessage);
		
		// c:\Windows\...
		String newPassingBackSlash = "c:\\Windows\\... \nnew line \ttab using";
		System.out.println(newPassingBackSlash);
		
	} 
}

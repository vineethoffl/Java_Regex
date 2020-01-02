package REGEX;
import java.util.regex.*;
import java.util.regex.Pattern;
public class RegexExample2
{
	public static void main(String[] args) 
	{
		Pattern pattern=Pattern.compile("Fa[a-z]e");
		Matcher m=pattern.matcher("Fake");
		if(m.find())
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println(Pattern.matches("Fa[ac]e","Fabe"));
		System.out.println(Pattern.matches("Do\\[","Do["));
		System.out.println(Pattern.matches("Do[\\[\\]]","Do]"));
		System.out.println(Pattern.matches("Hi\\d","Hi5"));
		System.out.println(Pattern.matches("Hi\\D","Hi5"));
		System.out.println(Pattern.matches("Hello\\sWorld","Hello World"));
		System.out.println(Pattern.matches("Hello\\World","Hello World"));
		System.out.println(Pattern.matches("Hi\\world","Hi5World"));
		System.out.println(Pattern.matches("Hi\\World","Hi5World"));
		Pattern p1=Pattern.compile("\\A[a-zA-Z]");//range of characters from
		Matcher m1=p1.matcher("Be strong");
		while(m1.find())
			System.out.println(m1.group());	
	}
}
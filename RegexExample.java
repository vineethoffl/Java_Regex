package REGEX;
import java.util.regex.*;
class RegexExample {

	public static void main(String[] args) 
	{
		String content= "Face - Focus Academy for career Enhancement - Face";
		String string= "Face";
		Pattern pattern=Pattern.compile(string);
		Matcher matcher=pattern.matcher(content);
		while(matcher.find())
		{
			System.out.println("Found at: "+ matcher.start()+" - " +(matcher.end()-1));
		}
		System.out.println(pattern.matches("focu.","focus"));
		System.out.println(pattern.matches("face.","face"));
		System.out.println(pattern.matches("fa*.","faa"));
		System.out.println(pattern.matches("fa*e.","fake"));
	}

}

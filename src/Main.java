import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	// This function tries to parse input string into a correctly formatted US phone number
	public static String extractNumberFormat(String input) {
		String USPhonePat = 
			"\\s*(?:\\(\\s*(\\d{3})\\s*\\)|(\\d{3}))\\s*\\-?\\s*(\\d{3})\\s*\\-?\\s*(\\d{4})\\s*"; 
		
		if (!input.matches(USPhonePat))
			return "Not Valid US Phone";
		
		Matcher m = Pattern.compile(USPhonePat).matcher(input); m.find();
		return "(" + (input.indexOf('(') >=0 ? m.group(1) : m.group(2)) + ")-" + m.group(3) + "-" + m.group(4);
	}
	
	// Sample Inputs
	public static void main(String[] args) {
		// Case 1: Match, with area code in parenthesis
		String NYU = "(212)  -998  1212";
		System.out.println(extractNumberFormat(NYU));
		
		// Case 2: Match		
		NYU = "212 9981212";
		System.out.println(extractNumberFormat(NYU));
		
		// Case 3: Match		
		NYU = "212  998 - 1212";
		System.out.println(extractNumberFormat(NYU));
		
		// Case 4: Not match: area code is not enclosed in parenthesis		
		NYU = "(212  -998 1212";
		System.out.println(extractNumberFormat(NYU));
		
		// Case 5: Not match: hyphen is not positioned correctly		
		NYU = "(212)-9981-212";
		System.out.println(extractNumberFormat(NYU));
		
		// Case 5: Not match: length is too short for US number		
		NYU = "(212)-99-212";
		System.out.println(extractNumberFormat(NYU));		
		
	}
}

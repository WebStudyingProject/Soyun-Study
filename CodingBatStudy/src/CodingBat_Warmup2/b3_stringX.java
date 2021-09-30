package CodingBat_Warmup2;
/*
 * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") �� "xHix"
stringX("abxxxcd") �� "abcd"
stringX("xabxxxcdx") �� "xabcdx"
 */
public class b3_stringX {
	public String stringX1(String str) {
		  String[] result=str.split("x");
		  return str;
	}
	
	// Solution
	public String stringX2(String str) {
		  String result = "";
		  for (int i=0; i<str.length(); i++) {
		    // Only append the char if it is not the "x" case
		    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
		      result = result + str.substring(i, i+1); // Could use str.charAt(i) here
		    }
		  }
		  return result;
	}
}

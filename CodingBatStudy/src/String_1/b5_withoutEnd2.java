package String_1;
/*
 * 
Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.


withouEnd2("Hello") �� "ell"
withouEnd2("abc") �� "b"
withouEnd2("ab") �� ""
 */
public class b5_withoutEnd2 {
	public String withouEnd2(String str) {
		  if(str.length()<2)
		  return "";
		  return str.substring(1,str.length()-1);
	}
	
	// Solution
	public String withouEnd21(String str) {
		  if (str.length() <= 2) {
		    return "";
		  }
		  
		  return str.substring(1, str.length()-1);
		  
		  // Solution notes: First screen out the length <= 2 case -- the result
		  // must be "" then. Otherwise, just return substring(1, len-1)
		  // and no length checks are required.
	}
}

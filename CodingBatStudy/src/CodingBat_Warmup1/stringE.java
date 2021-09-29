package CodingBat_Warmup1;
/*
 * 
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") �� true
stringE("Heelle") �� true
stringE("Heelele") �� false
 */
public class stringE {
	public boolean stringE1(String str) {
		  if(str.length()>7)
		  return false;
		  return true;
	}
	
	// Solution
	public boolean stringE2(String str) {
		  int count = 0;

		  for (int i=0; i<str.length(); i++) {
		    if (str.charAt(i) == 'e') count++;
		    // alternately: str.substring(i, i+1).equals("e")
		  }

		  return (count >= 1 && count <= 3);
	}
}

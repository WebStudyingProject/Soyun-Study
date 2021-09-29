package CodingBat_Warmup2;
/*
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) �� "ChoCho"
frontTimes("Chocolate", 3) �� "ChoChoCho"
frontTimes("Abc", 3) �� "AbcAbcAbc"
 */
public class frontTimes {
	public String frontTimes1(String str, int n) {
		  String tmp="";
		  for(int i=0; i<n; i++)
		  {
		    if(str.length()<3)
		    tmp=tmp+str;
		    else
		    tmp=tmp+str.substring(0,3);

		  }
		    
		  return tmp;
	}

	// Solution
	public String frontTimes2(String str, int n) {
		  int frontLen = 3;
		  if (frontLen > str.length()) {
		    frontLen = str.length();
		  }
		  String front = str.substring(0, frontLen);
		  
		  String result = "";
		  for (int i=0; i<n; i++) {
		    result = result + front;
		  }
		  return result;
	}
}

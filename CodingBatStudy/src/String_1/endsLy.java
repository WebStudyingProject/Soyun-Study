package String_1;
/*
 * 
Given a string, return true if it ends in "ly".


endsLy("oddly") �� true
endsLy("y") �� false
endsLy("oddy") �� false
 */
public class endsLy {
	public boolean endsLy1(String str) {
		  if(str.length()>1)
		  {
		  if(str.substring(str.length()-2).equals("ly"))
		  return true;
		  }
		  return false;
	}
	
	// Solution
    public boolean endsLy2(String str) {
        if (str.length() > 1 && str.substring(str.length() - 2).equals("ly")) return true;
        return false;
    }
}

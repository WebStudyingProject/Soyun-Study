package Logic_1;
/*Logic-1 > twoAsOne
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
twoAsOne(1, 2, 3) �� true
twoAsOne(3, 1, 2) �� true
twoAsOne(3, 2, 2) �� false*/
public class c1_twoAsOne {
	public boolean twoAsOne(int a, int b, int c) {
		  for(int i=1; i<5; i++)
		  {
		    if(b==a+i&&c==b+i)
		    return true;
		    if(a==c+i&&c==b+i)
		    return true;
		    if(a==c+i&&c==a+i)
		    return true;
		  }
		  return false;
		}
	
	// Solution
    public boolean stwoAsOne(int a, int b, int c) {
        if (a + b == c) return true;
        if (a + c == b) return true;
        if (b + c == a) return true;
        return false;
    }
}

/*package whatever //do not write package name here */

import java.io.*;
import java.util.function.*;

class GFG {
	public static void main (String[] args) {
	Predicate<Integer> f=(n)->(n%2==0);
	System.out.println(f.test(2));
	System.out.println(f.test(3));
	}
}
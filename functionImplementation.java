/*package whatever //do not write package name here */

import java.io.*;
import java.util.function.*;

class GFG {
	public static void main (String[] args) {
	Function<Integer,Integer> f=(n)->(n*n);
	System.out.println(f.apply(2));
	System.out.println(f.apply(3));
	}
}
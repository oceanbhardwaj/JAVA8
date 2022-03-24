/*package whatever //do not write package name here */

import java.io.*;
import java.util.function.*;

interface lambdaExpExample{
    public void abstractFunction(int x);
}
class GFG {
	public static void main (String[] args) {
	    lambdaExpExample ex=(f)->System.out.println(2*f);
	    ex.abstractFunction(5);

	}
}
----------------------------------------------------------------------------------------------------------------------------------------
/*package whatever //do not write package name here */

import java.io.*;
import java.util.function.*;

interface lambdaExpExample{
    public void abstractFunction();
}
class GFG {
	public static void main (String[] args) {
	    lambdaExpExample ex=()->System.out.println("HELLO!!!!!");
	    ex.abstractFunction();

	}
-------------------------------------------------------------------------------------------------------------------------------------------
/*package whatever //do not write package name here */

import java.io.*;
import java.util.function.Predicate;

@FunctionalInterface
interface interface1 {
    public void fun1();
}

interface interface2 extends interface1{
    public void fun2();
}
class A implements interface2{
     public void fun1(){
         System.out.println("HELLO FUN1!!!!!!");
     }
       public void fun2(){
         System.out.println("HELLO FUN2!!!!!!");
     }
     
         
         
        
     }

class GFG {
	public static void main (String[] args) {
	    A g=new A();
	    g.fun1();
	    g.fun2();
	    
	    

	}
}
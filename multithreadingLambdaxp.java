/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;


    class MyRun implements Runnable{
        public void run(){
            for(int i=0;i<10;i++){
                System.out.println("HELLO RUN METHOD!!!!!");
            }
        }
    }

class Abc{
	public static void main (String[] args) {
	   MyRun r=new MyRun();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++){
		    System.out.println("Hello outside thread!!!!");
		}
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------------
/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;

class Abc{
	public static void main (String[] args) {
	    Runnable r=()->{
	        for(int i=0;i<10;i++){
                System.out.println("HELLO RUN METHOD!!!!!");
            } 
	    };
	 
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++){
		    System.out.println("Hello outside thread!!!!");
		}
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------------
/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;
class A extends Thread{
    public void run(){
        for(int j=0;j<40;j++)
        System.out.println("Hello inside run!!!!!!!");
    }
    
}

class GFG {
	public static void main (String[] args) {
	    A a=new A();
	    a.start();
	    for(int i=0;i<50;i++){
	        System.out.println("Hello Outside run!!!!!!!!");
	    }
		
	}
}
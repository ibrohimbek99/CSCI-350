/*
 	Ibrokhimbek Pulatov
 	Professor Talaga
 	CSCI - 350
 	9/15/2022
 	HW-2
 
 */

package pi_estimation;
import java.util.*;	// For Vector

class Circle extends Thread {
	  private String name;
	  public double pi;
	  public int size;
	  Circle(String n){
		  name = n;
		  pi = 0.0;
		  size = 2500;
	  }
	  
	  public void run() {
	    System.out.println("This code is running in a thread " + name);
	    try {
	    	// Computationally hard code here
	    	Thread.sleep(1);
	    } catch (InterruptedException e) {
	         System.out.println("Thread " +  name + " interrupted.");
	    }
	    int pointCircle = 0, pointSquare = 0;
		double x_random, y_random;
		
		
		for(int i = 0; i < size*size; i++) {
			x_random = (Math.random() * size) / size;
			y_random = (Math.random() * size) / size;
			
			double distance = Math.pow(x_random, 2) + Math.pow(y_random, 2);
			
			if(distance <= 1) {
				pointCircle++;
			}
			pointSquare++;
			
			pi = (double)(4*pointCircle) / pointSquare;
		}
	    System.out.println("End" + name);
	  }
	}



	


public class estimating_pi_thread {

	public static void main(String[] args) {
		
		// A container to hold the threads
		Vector<Circle> threads = new Vector<Circle>();
		double sum = 0.0;
		long begin = System.currentTimeMillis();
		// Start all the threads
		for(Integer i = 0; i < 4; i++) {
			Circle c = new Circle("Thread " + i.toString());
			
			threads.add( c  );	// Hold onto the object so we can wait on it later
			c.start();			// Start the thread
								// The .run() method MUST be implemented
								// for this to work.  start starts a thread
								// and runs the run method.
		}
		
		// Now wait till they're all done
		for(Circle c : threads) {
			try {
				while(c.isAlive())Thread.sleep(1);// Even though the thread has finished, the object still exists
												  // and can be accessed to get data back.
			}catch(InterruptedException e) {
				System.out.print("Something went wrong");
			}
			
			
			sum +=c.pi;
			
	}
		
		System.out.println(sum/4);
		System.out.print("All threads done");
		long end = System.currentTimeMillis();
		long time = end-begin;
	    System.out.println();
	    System.out.println("Elapsed Time: "+time +" ms");
}
}
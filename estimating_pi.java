/*
 	Ibrokhimbek Pulatov
 	Professor Talaga
 	CSCI - 350
 	9/15/2022
 	HW-2
 
 */


package pi_estimation;

public class estimating_pi {
	public static double calculatingPi(int size) {
		int pointCircle = 0, pointSquare = 0;
		double x_random, y_random,pi = 0;
		
		
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
		return pi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10000;
		long begin = System.currentTimeMillis();
		double pi = calculatingPi(size);
		System.out.println("The pi estimation is " + pi);
		long end = System.currentTimeMillis();
		long time = end-begin;
	    System.out.println();
	    System.out.println("Elapsed Time: "+time +" ms");
	}

}

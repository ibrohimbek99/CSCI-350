/*
 	Ibrokhimbek Pulatov
 	Professor Talaga
 	CSCI - 350
 	9/8/2022
 	HW-1
 
 */

package wordStats.java;


import java. io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.HashMap;


public class wordStats {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		long begin = System.currentTimeMillis(); //start the function
		//text files need to be located in the same directory as the source code file 
		Path path = Paths.get(System.getProperty("user.dir")).resolve("WarAndPeace.txt"); 
		BufferedReader reader = new BufferedReader(new FileReader( path.toFile()));
		Map<String, Integer> wordFrequency = new HashMap<>(); 
		String line = reader.readLine();
		int counter=0;
		int unique = 0;
		
		
		while(line != null) {
			
			if(!line.trim().equals("")) {
				String [] words = line.split(" ");
				
				for(String word : words) {
					
					if(word == null || word.trim().equals("")) {
						continue;
					}
					
					String processed = word.toLowerCase();
					//processed = processed.replaceAll("[^A-Za-z0-9]", "");  removes all unnecessary symbols
					if(wordFrequency.containsKey(processed)){
						wordFrequency.put(processed, wordFrequency.get(processed)+ 1);	
					}
					
					else{
						wordFrequency.put(processed, 1);
						unique++;
					}
					counter++;				
				}					
			}
			
			line = reader.readLine();
		}
		
		System.out.printf("There were %d in the TomSawyer.txt\n", counter);
		System.out.printf("There were %d unique words in TomSawyer.txt\n", unique);
		
		//Used lambda expression to sort the priority queue
		PriorityQueue<String> pq = new PriorityQueue<>((valueOne, valueTwo) -> wordFrequency.get(valueTwo)
														== wordFrequency.get(valueOne) ? valueOne.compareTo(valueTwo) 
														: wordFrequency.get(valueTwo) - wordFrequency.get(valueOne));
		for(String word : wordFrequency.keySet()) {
			pq.add(word); //adding every single word to priority queue
		}
		
		int i = 1;
		
		while(i < 21){
		System.out.printf("%d       %s: %d\n",i, pq.peek(), wordFrequency.get(pq.peek()));
			pq.poll(); //popping the element
			i++;
		}
	/*	tried to do with hashtables
		int mostFrequent = 0;
		String theWord = null;
		
		int i = 1;
		while(i < 21) {
			for(String word : wordFrequency.keySet()) {
				Integer theVal = wordFrequency.get(word);
				if(theVal > mostFrequent) {
					mostFrequent = theVal;
					theWord = word;
					
					continue;
				}
				
				
			
			}
			System.out.printf("%d   %s: %d\n", i, theWord, mostFrequent);
			i++;*/
			
		
		long end = System.currentTimeMillis();
		long time = end-begin;
	    System.out.println();
	    System.out.println("Elapsed Time: "+time +" ms");
		}
			
	}	

/* 
 	WORKS CITED
 	https://www.baeldung.com/java-measure-elapsed-time
 	https://www.w3schools.com/java/java_hashmap.asp
 	https://devwithus.com/java-priority-queue/
 */

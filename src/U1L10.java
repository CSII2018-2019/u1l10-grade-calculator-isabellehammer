//Write a test grade calculator that uses arrays to store all the grades. Arrays need to be... 
//...declared with a size, so ask user how many grades they will input, then create array of... 
//...that size
//- Calculate average
//- Determine letter grades given a number
//- Determine lowest score
//- Average grade with lowest score dropped

import java.util.Arrays;
import java.util.Scanner;

public class U1L10 {

	public static void main(String[] args) {

		System.out.println("How many grades will you be entering?");
		//not sure if this is the way to go ??
		Scanner numberofGrades = new Scanner(System.in);
		int inputLength = numberofGrades.nextInt();
		char[] array = inputLength.toCharArray();
	      int arrayLength = array.length;
	      char [] original = Arrays.copyOf(array,array.length);
	   //have to ask them to enter the grades eventually
	   
	      
	   //to calculate the average
	   double total = 0;
	   for (int i = 0; i < array.length; i++) {
		   total += array[i];
		   double average = (total/array.length);
	   } System.out.println("Your average grade is " + average + ".");
	   
	   //finding lowest score
	   double min = array[0];
	   for (int i = 0; i < array.length; i++) {
		   if (array[i] < min) min = array[i];
	   }
	   
	   //average with lowest dropped
	  int newAvg = (average - min);
		
	
	/*
	 * public static String calculateGrade(int averageGrade, int indexOfHomeWork){
	    averageGrade = studentScoreArray.length/indexOfHomeWork;
	    String letterGrade;
	     
	    //below the conditions to be tested
	    if (averageGrade < 60 && averageGrade >=0)
	        letterGrade = "F";
	         
	    else if (averageGrade >=60 && averageGrade < 70)
	        letterGrade = "D";
	 
	    else if (averageGrade >=70 && averageGrade < 80)
	        letterGrade = "C";
	 
	    else if (averageGrade >= 80 && averageGrade < 90)
	        letterGrade = "B";
	 
	    else if (averageGrade >=90 && averageGrade <= 100)
	        letterGrade = "A";
	 
	    else
	        letterGrade = "Error, Incorrect Input";
	     
	    //DisplayvalueInArray(indexOfHomeWork);;
	    return letterGrade;
	    }
	    */
		

	}

}

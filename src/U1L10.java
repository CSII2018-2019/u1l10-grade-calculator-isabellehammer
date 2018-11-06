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
		//System.out.println(inputLength);
		int [] grades = new int [inputLength];
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Enter a grade.");
			Scanner grade = new Scanner(System.in);
			grades [i] = grade.nextInt();
		}
		
	   
	      
	   //to calculate the average
	   double total = 0;
	   for (int i = 0; i < grades.length; i++) {
		   total += grades[i];
	   }
	   int average = (int)(total/grades.length);
	   System.out.println("Your average grade is " + average + ".");
	   gradeLetter (average);
	   
	   //finding lowest score
	   double min = grades[0];
	   for (int i = 0; i < grades.length; i++) {
		   if (grades[i] < min) min = grades[i];
	   }
	   System.out.println("Your minimum grade is " + min);
	   
	   //average with lowest dropped
	  int newAvg = (int) ((total - min)/(grades.length - 1));
	  System.out.println("Your average grade with the lowest dropped is " + newAvg);
	  gradeLetter (newAvg);
		
	     
	    }
	public static void gradeLetter (int newAvg) {
		
	if (newAvg < 60 && newAvg >=0){
        System.out.println("Your grade is an F.");
         }
    else if (newAvg >=60 && newAvg < 70){
        System.out.println("Your grade is a D.");
        }
 
    else if (newAvg >=70 && newAvg < 80){
        System.out.println("Your grade is a C.");
        }
 
    else if (newAvg >= 80 && newAvg < 90){
        System.out.println("Your grade is a B.");
        }
 
    else if (newAvg >=90 && newAvg <= 100){
        System.out.println("Your grade is an A.");
        }
 
    else {
        System.out.println("Error: incorrect input.");
    }
	
	}
	
}

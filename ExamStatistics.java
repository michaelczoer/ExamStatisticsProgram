package Projects;	//Michael Czoer

import java.util.*;
import java.io.FileReader;
import java.io.IOException;
public class ExamStatistics 
{
	
	static int gradesMin(int [] grades) 
	{
		int ten = grades[1];
		return ten;
	}
	
	static int gradesMax(int [] grades)
	{
		int n = grades.length - 1;
		int tes = grades[n];
	
		return tes;
	}
	
	static double gradesMean(int [] grades)
	{
		int n = grades.length;
		int tex = ((grades[1] + grades[2] + grades[3] + grades[4])/n);
		return tex;
	}
	
	static double gradesMedian(int [] grades)
	{
		int abc = 0;
		if (grades.length % 2 == 1)
			abc = (grades.length-1)/2;
		else
			abc = (grades[grades.length - 1] + grades[grades.length - 2])/2;
		return abc;
	}
			
	static int [] gradesDistribution(int [] grades)
	{
		int [] t = new int [grades.length];
		for (int i = 0; i < grades.length; i++)
		{
		
		if (grades[i]>=90) {
			t[0] = t[0] + 1;
		}
		else if(grades[i]>=80) {
			t[1] = t[1] + 1;
		}
		else if(grades[i]>70) {
			t[2] = t[2] + 1;
		}
		else if(grades[i]>=60) {
			t[3] = t[3] + 1;
		}
		else {
			t[4] = t[4] + 1;
		}
		}
		
		return t;
		}
	
	
	/* you will need to fill in the arguments for this function.
	 * the arguments should be the various statistics you computed
	 * and should print them out in a neatly-formatted manner.
	 */
	static void printGradesInfo(int [] grades)
	{
		int [] t = gradesDistribution(grades);
		
		double abc = gradesMedian(grades);
		
		double tex = gradesMean(grades);
		
		int n = grades.length;
		
		int ten = gradesMin(grades);
		
		int tes = gradesMax(grades);
		
		System.out.println("There are " + n + " scores in this file.");
		
		System.out.println("The average of the scores is " + tex + ".");
		
		System.out.println("The lowest grade is " + ten);
		
		System.out.println("The highest score is " + tes);
		
		System.out.println("The median score is " + abc + ".");
		
		System.out.println("The grade distribution is as follows:");
		
		System.out.println(t[4] + " F's");
		
		System.out.println(t[3] + " D's");
		
		System.out.println(t[2] + " C's");
		
		System.out.println(t[1] + " B's");
		
		System.out.println(t[0] + " A's");
				
		System.out.println("Thank you for using ESP!");
	}	
	
	public static void main(String[] args) throws IOException
	
	{
		
		System.out.println("Enter the name of the text file containing the scores.");
		
		Scanner cin = new Scanner(System.in);
		
		String grades = cin.nextLine();//C:\\Users\\csam\\eclipse-workspace\\Projects\\textfile1
		
		Scanner fin = new Scanner(new FileReader(grades));
				
		int n = fin.nextInt();
		
		int [] a = new int[n];
		
		Arrays.sort(a); //sort the array after filling in w/values
		printGradesInfo(a);
		
		fin.close();
		
		cin.close();
	}
	}
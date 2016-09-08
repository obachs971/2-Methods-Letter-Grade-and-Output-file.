import java.io.*;
public class studentGrades 
{
	//Please ignore this part of the program, it was just to see if my methods were working.
	public static void main(String[] args) throws IOException
	{
		double grade1 = 98;
		double grade2 = 95;
		double grade3 = 103;
		String letterGrade;
		letterGrade = letterGrade(grade1, grade2, grade3);
		System.out.print(letterGrade);
		String name;
		name = "Sammy";
		outputFile(name,letterGrade);
	}
	
	
	
	/**
	 * 
	 * @param g1 The first grade in double.
	 * @param g2 The second grade in double.
	 * @param g3 The third grade in double.
	 * @return finalGrade The final grade that takes 20% of the first grade, 30% of the second grade, and 50% of the third grade. Returns a String.
	 */
	public static String letterGrade(double g1, double g2, double g3)
	{
		double finalnumGrade;
		String finalGrade;
		finalnumGrade = (g1 * 0.2) + (g2 * 0.3) + (g3 * 0.5);
		
		if(finalnumGrade >= 92)
		{
			finalGrade = "A";
		}
		else if(finalnumGrade >= 90)
		{
			finalGrade = "A-";
		}
		else if(finalnumGrade >= 88)
		{
			finalGrade = "B-";
		}
		else if(finalnumGrade >= 82)
		{
			finalGrade = "B";
		}
		else if(finalnumGrade >= 80)
		{
			finalGrade = "B-";
		}
		else if(finalnumGrade >= 78)
		{
			finalGrade = "C+";
		}
		else if(finalnumGrade >= 70)
		{
			finalGrade = "C";
		}
		else if(finalnumGrade >= 60)
		{
			finalGrade = "D";
		}
		else 
		{
			finalGrade = "F";
		}
		
		return finalGrade;
	}
	/**
	 * 
	 * @param sn The student's name.
	 * @param lg The letter grade the student will get. 
	 * @throws IOException
	 */
	public static void outputFile(String sn, String lg) throws IOException
	{
		PrintWriter outputFile = new PrintWriter("output.txt");
		outputFile.println(sn);
		outputFile.println(lg);
		outputFile.close();
	}
}


package classassigments;

public class Assignment6 {

	public static void main(String[] args) {


		//Assignment - 6(Arrays/Datatypes/Operators)
		//Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		//marks [75, 80, 82] Add 10 marks to each students using assignment operators and
		//store it into another array, after adding 10 marks identify the average marks of all students
		
		String[] studentsName= {"Suresh","Mahesh","Naresh"};
		int[] studentMarks = {75, 80, 82};
		
		int[] updatedMarks =
				{
						studentMarks[0]+= 10,
						studentMarks[1]+= 10,	
						studentMarks[2]+= 10
				};
		
		System.out.println("Students updated marks ");
		
		System.out.println(studentsName[0] + ":" + updatedMarks[0]);
		System.out.println(studentsName[1] + ":" + updatedMarks[1]);
		System.out.println(studentsName[2] + ":" + updatedMarks[2]);
		
		int average = (studentMarks[0] + studentMarks[1] + studentMarks[2]) / 3;
		
		System.out.println("Average marks of all students " + average);

	}

}

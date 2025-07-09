package classassigments;

public class Assignment2_3DArray {

	public static void main(String[] args) {
		
		 // 3D Array: [Semester][Subject/Marks][Values]
		
		// Step 1: Subjects in one Array , Marks in Another Array for each semester (1 D Array)
		// Step 2: Add above 2 Arrays in Another Array for each Semester (2 D Array)
		// Step 3: Add all above 5 semesters in another array (3 D Array)
		
		
		String[][][] semMarks = {//Semester 1
				{		
					{ "Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."},
					{"Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79)"}
				},
                { // Semester 2
                    {"Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},
                    {"Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)"}
                },
                { // Semester 3
                    {"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."},
                    {"Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)"}
                },
                { // Semester 4
                    {"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering"},
                    {"Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)"}
                },
                { // Semester 5
                    {"Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
                    {"Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)"}		
                }
                
		};
		
		System.out.println("Semester 2 - Subject 4 name " + semMarks[1][0][3]);
		System.out.println("Semester 2 - Subject 5 name " + semMarks[1][0][4]);

	}

}

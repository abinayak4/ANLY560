public class Assign2 {
	public static void main(String args[]) 
	{
	double grade1;
	double grade2;
	double grade3;
	double grade4;
	double grade5;
	int avg_grade;
	char Grade =0;
	
	grade1 = 91.14;
	grade2 = 85.01;
	grade3 = 72;
	grade4 = 63;
	grade5 = 81.14;

	avg_grade = (int)((grade1 + grade2 + grade3 + grade4 + grade5)/5);
	
	if( avg_grade < 100 && avg_grade>=90 ) {Grade = 'A';}
	if( avg_grade < 90 && avg_grade>=80 ) {Grade = 'B';}
	if( avg_grade < 80 && avg_grade>=70 ) {Grade = 'C';}
	if( avg_grade < 70 ) {Grade = 'F';}

	switch(Grade) {
	case 'A' :System.out.println("A: Fantastic job!");break;
	case 'B' :System.out.println("B: Good!");break;
	case 'C' :System.out.println("C: Please try more next time!");break; 
	case 'F' :System.out.println("F: Unfortunately you failed!");break;
	default  :System.out.println("Invalid grade");
	}	
	}
}

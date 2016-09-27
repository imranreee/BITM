import java.util.Scanner;

public class StudentGrad {

	public static void main(String[] args) {
		
        int studentMarks;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("<> Student Grading System <>");
		System.out.print("Please put the marks: ");
		
		while(true){
			studentMarks = sc.nextInt();
			
			if (studentMarks > 100 || studentMarks < 0) {
				System.out.println("You have entered wrong number!!");
				break;
			}
			else if (studentMarks > 79) {
				System.out.println("You have got A+");
			}
			else if(studentMarks > 69 && studentMarks < 80){
				System.out.println("You have got A grad");
			}
			else if(studentMarks > 59 && studentMarks < 70){
				System.out.println("You have got A-");
			}
			else if(studentMarks > 49 && studentMarks < 60 ){
				System.out.println("You have got B grad");
			}
			else if(studentMarks > 39 && studentMarks < 50){
				System.out.println("You have got C grad");
			}
			else if(studentMarks > 32 && studentMarks < 40){
				System.out.println("You have got D grad");
			}
			else{
				System.out.println("You have failed :(");
				System.out.println("No warry, Please try again and again, good luck :)");
			}
		}
	}
}

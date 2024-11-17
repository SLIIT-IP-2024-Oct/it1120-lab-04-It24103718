import java.util.Scanner;
public class IT24103718Lab4Q2 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the exam_marks: ");
	double exam_marks = input.nextDouble();
	System.out.println("Enter the lab_marks: ");
	double lab_marks = input.nextDouble();	

	if((exam_marks < 0 || exam_marks > 100) || (lab_marks < 0 || lab_marks > 100)){
	System.out.println("Error: mark should be between 0 and 100 ");
	return;
	}
	System.out.println("Enter the exam_percentage: ");
	double exam_percentage = input.nextDouble();
	System.out.println("Enter the lab_percentage: ");
	double lab_percentage = input.nextDouble();
	if(exam_percentage + lab_percentage != 100) {
	System.out.println("Error: percentage must add up to 100 ");
	return;
	}
	double final_marks = (exam_marks*exam_percentage/100) + (lab_marks*lab_percentage/100);
	System.out.println("Final exam_mark is: " + final_marks);
	input.close();
	}
}
	
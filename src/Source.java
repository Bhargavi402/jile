import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String object = scanner.nextLine();

		Student Student = null;
		if (object.equals("EngineeringStudent")) {
			int studentId = scanner.nextInt();
			scanner.nextLine();
			String studentName = scanner.next();
			scanner.nextLine();
			String college  = scanner.nextLine();			
			String stream = scanner.nextLine();
			Student=new Student(studentId,studentName, college, stream);
			Student.getDetails();
		}
		else if (object.equals("Student")){
			int studentId = scanner.nextInt();
			scanner.nextLine();
			String studentName = scanner.next();
			scanner.nextLine();
			String college  = scanner.nextLine();
			Student = new Student(studentId, studentName, college);
			Student.getDetails();
		}
		else {
			System.out.println("Invalid Input");
        }

}
}

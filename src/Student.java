import java.util.Scanner;

class Student{
		private int studentId;
		private String studentName;
		private String college;

		public Student(int studentId, String studentName, String college, String stream) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.college = college;
		}
		public Student(int studentId2, String studentName2, String college2) {
			// TODO Auto-generated constructor stub
		}
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getCollege() {
			return college;
		}
		public void setCollege(String college) {
			this.college = college;
		}
		public void getDetails() {
			System.out.println("Student ID: " + studentId);
			System.out.println("Student Name: " + studentName);
			System.out.println("College: " + college);

		}
	}

	class EngineeringStudent extends Student {

		private String stream;

		public EngineeringStudent(int studentId, String studentName, String college, String stream) {
			super(studentId, studentName, college);
			this.stream = stream;
		}
		public String getStream() {
			return stream;
		}
		public void setStream(String stream) {
			this.stream = stream;
		}
		public void getDetails() {
			super.getDetails();
			System.out.println("Stream: " + stream);
		}
	}


package streams;

public class Student {
	private String studentName;
	private String studentClass;
	private int studentMark;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public int getStudentMark() {
		return studentMark;
	}

	public void setStudentMark(int studentMark) {
		this.studentMark = studentMark;
	}

	public Student(String studentName, String studentClass, int studentMark) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentMark = studentMark;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentClass=" + studentClass + ", studentMark=" + studentMark
				+ "]";
	}

}

package streams;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student("Logesh", "5", 56);
		Student student2 = new Student("Mukesh", "5", 87);
		Student student3 = new Student("Rajesh", "3", 99);
		List<Student> allStudents = new ArrayList<>();

		allStudents.add(student1);
		allStudents.add(student2);
		allStudents.add(student3);

		System.out.println(allStudents);
		
		allStudents.stream().filter(s -> s.getStudentClass().equals("5")).sorted(Comparator.comparing(Student::getStudentName).reversed())
				.forEach(s -> System.out.println(s.getStudentName() + " " + s.getStudentMark()));
		
		
		allStudents.stream().filter(s -> s.getStudentClass().equals("5"))
				.sorted(Comparator.comparing(Student::getStudentMark)).forEach(System.out::println);
		
		//To new list - Creation
		List<Student> newList = allStudents.stream().filter(s -> s.getStudentClass().equals("5"))
				.collect(Collectors.toCollection(LinkedList<Student>::new));
		System.out.println(newList);
		
	}

}

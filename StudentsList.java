package HW8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fmi.informatics.extending.Student;

public class StudentsList<T extends Student> {

	public static void StuList() {
		List<Student> List = new ArrayList<>();
		Student.StudentGenerator.make();

		List.forEach(
				(student) -> System.out.println("Име: " + student.getName() + "Университет: " + student.getUniversity()
						+ "Специалност: " + student.getSpeciality() + "Факултетен номер: " + student.getFacNumber()));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert AnyKey: ");
		String key = scanner.nextLine();
		System.out.println("Студенти: " + List);
	}

	Collections.sort(List);

	   System.out.println("After Sorting:");
	   for(String sorter: List) {
			System.out.println(sorter);
		}

}

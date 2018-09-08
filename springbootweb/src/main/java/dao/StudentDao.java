package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import model.Student;

@Repository

public class StudentDao {
	/**
	 * Khai bao map 
	 */
	private static Map<String,Student> studentMap = new HashMap<String,Student>();
	
	/**
	 * dinh nghia static
	 */
	static {
		initStudent();
	}

	private static void initStudent() {
		
		Student student1 = new Student("MH01","Nguyen Van Thanh","K40A");
		Student student2 = new Student("MH02","Nguyen Thi Thanh Van","K39B");
		Student student3 = new Student("MH03","Nguyen Van Hung","K38C");
		
		studentMap.put(student1.getMaSV(),student1);
		studentMap.put(student2.getMaSV(),student2);
		studentMap.put(student3.getMaSV(), student3);
	}
	
	/**
	 * CRUD function for student
	 */
	
	public Student getStudent(String ma) {
		return studentMap.get(ma);
	}
	
	public Student addStudent(Student tempStudent) {
		studentMap.put(tempStudent.getMaSV(), tempStudent);
		return tempStudent;
	}
	
	public void deleteStudent(String ma) {
		studentMap.remove(ma);
	}
	
	public ArrayList<Student> getAllStudents(){
		Collection<Student> collection = studentMap.values();
		ArrayList<Student> listStudents = new ArrayList<Student>();
		listStudents.addAll(collection);
		return listStudents;
	}
	
}

package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */



import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studList = new ArrayList<Student>();
		studList.add(new Student("David", "1899"));
		studList.add(new Student("Jack", "1085"));
		studList.add(new Student("Kevin", "1985"));
		studList.get(0).showInfo();
		studList.get(0).addCourse("程式一", "1050807");
		studList.get(0).showInfo();

	}

}

class Student {
	private String id, name;
	private ArrayList<Course> CouList = new ArrayList<Course>();

	public Student(String Name1, String id1) {
		name = Name1;
		id = id1;
	}

	public void showInfo() {
		System.out.println("name:" + name);
		System.out.println("id:" + id);
		System.out.println("#of Course:" + CouList.size());
		for (int i = 0; i < CouList.size(); i++) {
			System.out.println("course name:" + CouList.get(i).getName());
			System.out.println("ID:" + CouList.get(i).getID());
		}

	}

	public void addCourse(String name1, String id1) {
		CouList.add(new Course(name1, id1));
	}
}

    class Course{
	private String couName, couID, teacher;
	private int score;

	public Course(String name1, String id1) {
		couName = name1;
		couID = id1;
	}

	public String getName() {
		return couName;

	}

	public String getID() {
		return couID;
	}

}

package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 105021046 賴沛錞
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studList = new ArrayList<Student>();

		String str[] = { "姓名", "ID", "國文", "英文", "數學", "平均" };
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		int n = scn.nextInt();

		for (int i = 0; i < n; i++) {

			studList.add(new Student(scn.next(), scn.next()));
			studList.get(i).addCourse(scn.nextInt(), scn.nextInt(), scn.nextInt());

		}
		for (int i = 0; i < 6; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println();
		Student a;
		for (int i = 0; i < studList.size(); i++) {
			for (int j = 0; j < studList.size(); j++) {
				if (studList.get(i).Avange() > studList.get(j).Avange()) {
					a = studList.get(i);
					studList.set(i, studList.get(j));
					studList.set(j, a);

				}
			}
		}
		for (int i = 0; i < studList.size(); i++) {

			System.out.print(studList.get(i).getID() + "\t");
			System.out.print(studList.get(i).getName() + "\t");
			studList.get(i).sum();
			System.out.println(studList.get(i).Avange() + "\t");
		}
		// studList.add(new Student("David", "1899"));
		// studList.add(new Student("Jack", "1085"));
		// studList.add(new Student("Kevin", "1985"));
		// studList.get(0).showInfo();

	}

}

class Student {
	private String id, name;
	ArrayList<Course> CouList = new ArrayList<Course>();

	public Student(String id1, String Name1) {
		id = id1;
		name = Name1;

	}

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void addCourse(int a, int b, int c) {
		CouList.add(new Course(a, b, c));
	}

	public float Avange() {
		float d = 0;
		for (int i = 0; i < CouList.size(); i++) {
			d = (CouList.get(i).getChinese() + CouList.get(i).getEnglish() + CouList.get(i).getMath()) / 3;
		}
		return d;
	}

	public void sum() {
		for (int i = 0; i < CouList.size(); i++) {
			System.out.print(CouList.get(i).getChinese()+"\t");
			System.out.print(CouList.get(i).getEnglish()+"\t");
			System.out.print(CouList.get(i).getMath()+"\t");
		}
	}
}

class Course {
	private String couName, couID, teacher;
	private int CHscore, ENGscore, MATHscore;

	public Course(int a, int b, int c) {
		CHscore = a;
		ENGscore = b;
		MATHscore = c;
	}

	public int getChinese() {
		return CHscore;

	}

	public int getEnglish() {
		return ENGscore;
	}

	public int getMath() {
		return MATHscore;
	}

}

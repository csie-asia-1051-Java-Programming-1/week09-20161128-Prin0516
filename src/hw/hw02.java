package hw;

/*
 * Topic: 頛詨銝��迤�� N嚗���������摮��� N �甇Ｕ��
����:1 2 4 7 11 16 22 29��
�����:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 1050210XX �瘞豢�葦
 */
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		int n = scn.nextInt();
		int a = 1;
		int sum = 1;
		while (sum <= n) {
			System.out.println(sum);
			sum += a;
			a++;

		}
		System.out.println(sum);

	}

}

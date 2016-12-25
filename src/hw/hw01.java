package hw;

/*
 * Topic: 霈蝙��撓�銝�甇���嚗��撘���銝���蝥�����府�����甇支�甇���嚗��迤��銝虫�����蝥�嚗�銝������o���
 靘��: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author: 1050210XX �瘞豢�葦
 */
import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		int d=0;
		for (int i = 1; i < n; i++) {
			d = 1;
			sum = 0;
			for (int j = i; j < n; j++) {
				sum += j;
				if (sum == n) {
					System.out.print("=");
					for (int s = i; s <= j; s++) {
						
						System.out.print(s);
						if (s < j) {
							System.out.print("+");
						}
					}
					System.out.println();
				}

			}
			
		}
		if (d ==0) {
			System.out.println("no");
		}
	}
}

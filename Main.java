/* 针对牛客网中部分题目的java版输入
 * 使用java的Scanner读取键盘输入（String型），两种情况 
 * 1.有空格输入
 * 2.无空格输入
 * 使用stream转换String型输入为int数组
 * case1：
 * 5
 * 1 2 3 4 5
 * out：
 * [1, 2, 3, 4, 5]
 * case2：
 * 5
 * 12345
 * [1, 2, 3, 4, 5]
 */
package exam.offer;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 输入数组元素个数N 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String inum = sc.nextLine();
		sc.close();
		int num[] = new int[N];
		if (inum.contains(" ")) {
			// 若有空格使用
			num = Arrays.stream(inum.split(" ")).mapToInt(Integer::parseInt).toArray();
		} else {
			// 无空格使用
			num = inum.chars().map(i -> i - '0').toArray();
		}
		System.out.println(Arrays.toString(num));

	}

}

/* ���ţ�����в�����Ŀ��java������
 * ʹ��java��Scanner��ȡ�������루String�ͣ���������� 
 * 2.�޿ո�����
 * case1��
 * 5
 * 1 2 3 4 5
 * out��
 * [1, 2, 3, 4, 5]
 * case2��
 * 5
 * 12345
 * [1, 2, 3, 4, 5]
 */
package exam.offer;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� N K
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String inum = sc.nextLine();
		sc.close();
		int num[] = new int[N];
		if (inum.contains(" ")) {
			// ���пո�ʹ��
			num = Arrays.stream(inum.split(" ")).mapToInt(Integer::parseInt).toArray();
		} else {
			// �޿ո�ʹ��
			num = inum.chars().map(i -> i - '0').toArray();
		}
		System.out.println(Arrays.toString(num));

	}

}

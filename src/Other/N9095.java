package Other;
import java.util.Scanner;

// ����Լ� ����
public class N9095 {

	static int nCount = 0;
	
	static void n_sum(int num) {
		if (num == 0) {
			nCount++;
			return;
		} else if (num < 0) {
			return;
		} else {
			n_sum(num-1);
			n_sum(num-2);
			n_sum(num-3);
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 * ���Ʈ ����
		 *  ���� 
		 * 	1) ��� ����� ���� �õ����� �� �־��� �ð��ȿ� ������ ��(1�� => 2��� ����)
		 *  2) ������/�˰����� ������ ���� ���
		 *  Ǫ�� ���  
		 * 	1. �ݺ��� (�������� ������ ����   ex) ESM(����������), ������(n�� for��)
		 * 	2. ����Լ� (�ݺ������� �� Ǯ�� ���� ��� ���)
		 * 		����
		 *   	1) ����ΰ� ��ܿ� ���� > ����ΰ� ���� ��� �������ȣ�� runTime error, �ڵ带 �Ǵ��ϱ� ����
		 *   	2) ȣ��ΰ� �ϴܿ� ���� > 
		 */
		
		Scanner sc = new Scanner(System.in);
		int n, temp;
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			nCount = 0; // �ʱ�ȭ�� �� �ҽ� ���� i�� nCount�� �����ȴ�.
			temp = sc.nextInt();
			n_sum(temp);
			System.out.println(nCount);
			
		}
		
		
	}

}

package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// OX����
public class N8958 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		/*
		 * StringBuilder
		 * 
		 * 	1. �Ϲ����� StringBuffer�� String�� ������ �� ������ ��������.
		 * 	2. StringBuilder�� String + ���ڿ��� ��, ���ο� ��ü�� �����ϴ� ���� �ƴ� ������ ������ �ڿ� ���Ѵ�
		 * 	3. ���� �ӵ��� ������ ��������� ���ϰ� ����.
		 * 		* �� ���ڿ��� ���Ҷ� ����ϸ� ����
		 * - �����-
		 * StringBuilder sb = new StringBuilder;	// ����
		 * sb.append(t); 							// t��� ���ڿ��� �߰��Ѵ�. 
		 * sb.append(a);							// a��� ���ڿ��� �߰��Ѵ�.
		 * System.out.println(sb.toString());		// �׿��ִ� sb�� ���
		 */
		
		int N = Integer.parseInt(br.readLine());
		
		String[] arr = new String[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		for (int i = 0; i < N; i++) {
			
			int cnt = 0;
			int sum = 0;
			
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			sb.append(sum).append('\n');
		}
		
		System.out.println(sb);
	}

}

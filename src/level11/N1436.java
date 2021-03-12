package level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ��ȭ���� ��
public class N1436 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int num = 666;
		int count = 1;
		
		while(count != N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
			
			// String.valueOf() - �Ķ���Ͱ� null�̸� ���ڿ� "null"�� ���� ��ȯ�Ѵ�. (NPE ������ ���� ��� ����)
			// toString() - ��� ���� null�̸� NPE�� �߻���Ű�� Object�� ��� ���� String�� �ƴϿ��� ����Ѵ�.
			
			// contains() - �Լ��� ��� ���ڿ��� Ư�� ���ڿ��� ���ԵǾ� �ִ��� Ȯ���ϴ� �Լ�
			
		}
		
		System.out.println(num);
		
	}

}

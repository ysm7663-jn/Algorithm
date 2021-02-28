package level3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//BufferedReader ��ü ����(�ֿܼ��� �Է� ����)
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	//BufferedWriter ��ü ����
		
		int n = Integer.parseInt(br.readLine().trim());		// parseInt(���� ����), ���� ������ �Է� ����
		
		for(int i = 0; i < n; i++) {
			String text = br.readLine();
			String[] word = text.split(" ");	
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			bw.write((a+b) + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}

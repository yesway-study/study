package cn.yesway.studu.io;

//ʹ�� BufferedReader �ڿ���̨��ȡ�ַ�

import java.io.*;

public class IoStudy {
	public static void main(String args[]) throws IOException {
		char c;
		// ʹ�� System.in ���� BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�����ַ�, ���� 'q' ���˳���");
		// ��ȡ�ַ�
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != 'q');
	}
}
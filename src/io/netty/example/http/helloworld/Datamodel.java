package io.netty.example.http.helloworld;

import java.util.*;

public class Datamodel {

	public int getoperator() {
		Scanner in = new Scanner(System.in); // ʹ��Scanner�ඨ�����
		System.out.println("������һ��������:");
		int operator = in.nextInt();
		// in.close();
		return operator;
	}

	public int getoperand() {
		Scanner in = new Scanner(System.in); // ʹ��Scanner�ඨ�����
		System.out.println("������һ��������:");
		int operand = in.nextInt();
		// in.close();
		return operand;
	}

}

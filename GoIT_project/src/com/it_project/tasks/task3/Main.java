package com.it_project.tasks.task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


     	Scanner scanner = new Scanner(System.in);
		String number1 = scanner.nextLine();
		String number2 = scanner.nextLine();

		Divider arithmeticDivider = new Divider();
		
		String s = arithmeticDivider.getLongDivision(number1, number2);

		System.out.print(s);

	}
}

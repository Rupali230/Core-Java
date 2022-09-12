package com.rays.basics;

public class ttttt {

	public static void main(String[] args) {

		String a = "Rupali patel";
		String[] b = a.split(" ");
		for (int i = 0; i < b.length; i++) {

			for (int j = b[i].length() - 1; j >= 0; j--) {

				System.out.print(b[i].charAt( j));
			
			}System.out.print(  " ");

		}

	}
}

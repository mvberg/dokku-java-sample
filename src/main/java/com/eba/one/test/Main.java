package com.eba.one.test;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world.");

		new Main();
	}

	public Main() {

		while (!Thread.interrupted()) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				return;
			}

		}

		System.out.println("Goodbye world!");
	}

}

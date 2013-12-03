package com.eba.one.test;

public class Main {

	public Main m;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello world again");

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

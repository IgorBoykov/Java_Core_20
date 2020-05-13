package Task1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		System.out.println("Введіть два числa Фібоначі");
		MyThread thread = new MyThread();
		thread.start();

		RunnableThread runnable = new RunnableThread();
		Thread t = new Thread(runnable);
		t.start();

	}

}

class MyThread extends Thread {

	public void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {

			System.out.println(i);
			if (i == a - 1) {
				System.out.println("Числення завершено");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class RunnableThread implements Runnable {

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = a; i >= 1; i--) {
			System.out.println(i);
			if (i == 1) {
				System.out.println("Числення завершено");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
package _03_Threaded_Greeting;

import javax.swing.JOptionPane;

public class ThreadedGreeter implements Runnable {
	int num;
	ThreadedGreeter(int num) {
		this.num=num;
	}
	public void run() {
		
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number "+num);
		if (num<=50){
			ThreadedGreeter TG = new ThreadedGreeter(num+1);
			Thread main = new Thread(TG);
			main.start();
			try {
				main.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}}


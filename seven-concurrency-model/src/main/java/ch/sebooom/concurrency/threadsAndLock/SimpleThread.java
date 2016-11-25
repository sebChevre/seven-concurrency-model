package ch.sebooom.concurrency.threadsAndLock;

import static ch.sebooom.concurrency.Util.*;
public class SimpleThread {

	public static void main(String[] args) throws InterruptedException {
		
		Thread myThread = new Thread() {
		
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(threadLogs("Hello from new thread"));
				
			}
		};
		
		//d�marrage du Thread de mani�re concurrente a la m�thode main
		myThread.start();
		
		//sp�cifie que le thread acutuel est pret � ceder son utilisation processeur
		//Thread.yield();
		
		//dans tous les cas println du new Thread en premier
		//Thread.sleep(1);
		
		System.out.println(threadLogs("Hello from main thread"));
		//attente de fin du thread, si comment�, pas de fin du tread enfant
		myThread.join();
		
		System.exit(0);
	}
	
	
	
}

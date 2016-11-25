package ch.sebooom.concurrency.threadsAndLock;

import static ch.sebooom.concurrency.Util.*;

public class SimpleThreadDaemon {

public static void main(String[] args) throws InterruptedException {
		
		DaemonThread myThread = new DaemonThread();
		
		//démarrage du Thread de manière concurrente a la méthode main
		myThread.start();
		
		//spécifie que le thread acutuel est pret à ceder son utilisation processeur
		Thread.yield();
		
		System.out.println(threadLogs("Hello from main thread"));
		
	}
	
	
	
}

/**
 * Thread déifni comme daemon, ser arelaché dés la fin de la méthode main
 * @author sce
 *
 */
class DaemonThread extends Thread{
	
	public DaemonThread(){
		setDaemon(false);
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(threadLogs("Hello from new thread"));
		
	}
}

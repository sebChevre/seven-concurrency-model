package ch.sebooom.concurrency.threadsAndLock;

import static ch.sebooom.concurrency.Util.*;

public class SimpleThreadDaemon {

public static void main(String[] args) throws InterruptedException {
		
		DaemonThread myThread = new DaemonThread();
		
		//d�marrage du Thread de mani�re concurrente a la m�thode main
		myThread.start();
		
		//sp�cifie que le thread acutuel est pret � ceder son utilisation processeur
		Thread.yield();
		
		System.out.println(threadLogs("Hello from main thread"));
		
	}
	
	
	
}

/**
 * Thread d�ifni comme daemon, ser arelach� d�s la fin de la m�thode main
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

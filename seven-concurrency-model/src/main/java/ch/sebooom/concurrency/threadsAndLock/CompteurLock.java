package ch.sebooom.concurrency.threadsAndLock;

public class CompteurLock {
	
	public static void main(String[] args) throws InterruptedException{
		
		final Compteur counter = new Compteur();
		
		class CountingThread extends Thread {
			public void run() {
				for(int x = 0; x < 10000; ++x)
				counter.increment();
			}
		}
		
		CountingThread t1 = new CountingThread();
		CountingThread t2 = new CountingThread();
		
		t1.start();
		t2.start();
		
		t1.join(); 
		t2.join();
		
		System.out.println(counter.getCount());

	}

}

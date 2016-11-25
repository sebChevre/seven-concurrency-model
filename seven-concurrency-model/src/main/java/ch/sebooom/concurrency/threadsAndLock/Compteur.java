package ch.sebooom.concurrency.threadsAndLock;

public class Compteur {
	private int count = 0;
	public void increment() { ++count; }
	public int getCount() { return count; }
}

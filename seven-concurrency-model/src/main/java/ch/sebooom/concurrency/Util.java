package ch.sebooom.concurrency;

public class Util {

	public static String threadLogs(String msg){
		return "[" + Thread.currentThread().getName() + "] - " + msg;
	}
}

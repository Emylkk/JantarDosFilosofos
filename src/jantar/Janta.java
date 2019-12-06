package jantar;

import java.util.concurrent.Semaphore;

public class Janta{

	public static void main(String[] args) throws InterruptedException {
		Semaphore s = new Semaphore(2);
		Filosofos[] filosof = new Filosofos[5];
		for(int i = 0; i < 5;i++) {
			filosof[i] = new Filosofos(i,s);
			Thread t = new Thread(filosof[i]);
			t.start();
			//filosof.start();
		}
	}

}

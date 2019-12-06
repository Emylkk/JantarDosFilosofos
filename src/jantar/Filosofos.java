package jantar;

import java.util.concurrent.Semaphore;

public class Filosofos extends Thread  {
	
	Semaphore semaf;
	int filosofoNum;
	
	@Override
	public void run() {
		while(1==1) {
			super.run();
			pensar();
			try {
				semaf.acquire();
				comer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				semaf.release();
		
			}
		}
	}
	
	public Filosofos(int filosofo,Semaphore semaforo) {
		this.semaf= semaforo;
		this.filosofoNum= filosofo;
	}
	private void comer() {
		
		try {
			System.out.println("Filofo" +filosofoNum+ " Está Comendo");
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void pensar() {
		System.out.println("Filosofo" +filosofoNum+ " Está Pensando");
	}

	
}







public class EsercizioJoin extends Thread {

	public EsercizioJoin(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName() + "Start");
		for (int tick = 0; tick < 10000; tick++) {
			System.out.println(getName() + " End");
		}
	}
	
	public static void main (String[] args) throws InterruptedException {
		
			System.out.println("Main = START");
			Thread t = new EsercizioJoin ("Pippo");
			t.start();
			t.join();
			System.out.println("Main = END");
		}
	}
	

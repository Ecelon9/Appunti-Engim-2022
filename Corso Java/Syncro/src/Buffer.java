
public class Buffer {
	
	private int valore;
	private boolean disponibile = false;
	
	public synchronized int get() {
		while (disponibile == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		disponibile = false;
		return valore;
	}
	
	public synchronized void put(int value) {
		while (disponibile == true) {
			try {
				wait(); 
			} catch (InterruptedException e) {
				
			}
		}
		valore = value;
		disponibile = true;
		notifyAll();
	}
	
	
}

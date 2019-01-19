import java.util.LinkedList;

public class prodconsumer {
	public static void main(String args[]) {
		final PC pc = new PC();
		Thread p = new Thread(new Runnable() {
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread c = new Thread(new Runnable() {
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
		p.start();
		c.start();
	}
}

 class PC{
	LinkedList<Integer> list = new LinkedList<Integer>();
	int cap = 3;
	public void produce() throws InterruptedException {
		
		int val = 0;
		synchronized (this) {
			while(true) {
				list.add(val);
				System.out.println("Producer produced-"+ val++);
				while(list.size() == cap) {
					wait();
				}
				notify();
				//Thread.sleep(1000); 
			}			
		}
	}
	public void consume() throws InterruptedException {
		synchronized (this) {
			while(true) {
				 while (list.size()==0) 
                     wait();
				 int x = list.remove();
				System.out.println("Consumer consumed-" + x);
				notify();
				Thread.sleep(3000);
			}
		}
	}
}
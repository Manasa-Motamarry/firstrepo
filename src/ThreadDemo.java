//class Thre extends Thread {
//
//}

class Thr extends Thread {
	//private int thread_num;
Thread tr;
	Thr() {
		tr =  new Thread(this);
		tr.start();
		
		tr.setName("Thread1");
		tr.setPriority(Thread.NORM_PRIORITY-1);
	}

	public void run() {
		for (int i = 1; i < 50; i++) {
			System.out.println("child thread:+ thread_num" + (i * 5));
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {
	public static void main(String args[]) {
		Thr obj = new Thr();

		Thr obj1 = new Thr();
		// obj1.start();

		Thr obj2 = new Thr();
		// obj2.start();

		for (int x = 1; x < 50; x++) {
			System.out.println("parent main:" + (x * 3));
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

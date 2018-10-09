
class Thr1 implements Runnable 
{

	public void run()
	{
		for (int i = 1; i < 50; i++)
		{
			System.out.println("child thread:+ thread_num" + (i * 5));
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableEg {
	public static void main(String args[]) {
		Thr1 obj = new Thr1();
		Thread t = new Thread(obj);
		t.start();
		
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
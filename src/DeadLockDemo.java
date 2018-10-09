class Thread1 extends Thread
{
	public void run()
	{
		synchronized(DeadLockDemo.str1)
		{
			
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			synchronized(DeadLockDemo.str2)
			{
				System.out.println("in thread2:" +DeadLockDemo.str1+" "+DeadLockDemo.str2);
			}
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		synchronized(DeadLockDemo.str2)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(DeadLockDemo.str1)
			{
				System.out.println("in thread2:" +DeadLockDemo.str1+" "+DeadLockDemo.str2);
			}
		}
	}
}
public class DeadLockDemo {
static String str1 = "hello";
static String str2 = "yoloo";
public static void main(String args[]) throws InterruptedException
{
	System.out.println("before starting thread1");
	Thread t1 = new Thread1();
			t1.start();
			
			System.out.println("before starting thread1");
			Thread2 t2 = new Thread2();
					t1.start();
					
					t1.join();
					t2.join();
					System.out.println("Exiting main thread");
	
}
}

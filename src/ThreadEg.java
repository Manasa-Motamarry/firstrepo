

	class Abc implements Runnable
	{	
		Thread t;
		Abc()	
		{		
			t = new Thread(this);	
			t.start();	
			t.setName("MyThread");	
			t.setPriority(Thread.NORM_PRIORITY-1);
			}	
		public void run()
		{		
			for(int i=1;i<50;i++)	
			{		
				System.out.println(t+" "+(i*5));		
				try{		
					Thread.sleep(50);		
					}
				catch(Exception et)		
				{			
					System.out.println("Exceptionnn:");		
					et.printStackTrace();		
					}	
				}	
			}
		}
	public class ThreadEg {	
		public static void main(String args[]) 	{	
			Abc obj = new Abc();	
			for(int x=1;x<50;x++)	
			{		
				System.out.println("Parent Main: "+(x*3));	
				try{	
					Thread.sleep(250);		
					}
				catch(InterruptedException et)	
				{			
					et.printStackTrace();		
					}	
				}
			}
		}



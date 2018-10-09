
class TableA{  
  
	//prints multiplication table of a given int
 void printTable(int n){  
	 System.out.println("----------starting multiples of:"+n);
	 
synchronized(this)
{
   for(int i=1;i<=10;i++){  
     System.out.println("multiple of:"+n +" is "+n*i);  
     try{  
       Thread.sleep(500);  
     }catch(Exception e){ System.out.println(e);}  
   }  
}
   System.out.println("----------ending multiples of:"+n);
 }  
}  
  
class MyThread1A extends Thread{  
	TableA ta;
	MyThread1A(TableA ta)
	{
		this.ta = ta;
	}
	public void run(){  
	ta.printTable(1);  
	}  
}  
  
class MyThread2A extends Thread{  
	TableA ta;
	MyThread2A(TableA ta)
	{
		this.ta = ta;
	}
	public void run(){  
	ta.printTable(10);  
	}  
}   

class MyThread3A extends Thread{  
	TableA ta;
	MyThread3A(TableA ta)
	{
		this.ta = ta;
	}
 public void run(){  
	ta.printTable(13);  
	}  
}   

public class SecondClass3{  
public static void main(String t[]){  
	
TableA ta = new TableA();

MyThread1A t1=new MyThread1A(ta);  
MyThread2A t2=new MyThread2A(ta);  
MyThread3A t3=new MyThread3A(ta); 

t1.start();  
//t1.start(); //throws IllegalThreadStateException , since the thread has already been started
t2.start();  
t3.start();


//Thread can also be started, using anonymous object
//new MyThread1A().start();

} 
}



/*Assignment 1
 * create one thread with extends Thread
 * create another thread with implements Runnable
 * Assignment 2
 * Re write above example code, using only one Thread class
*/

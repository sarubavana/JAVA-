Class Table
{
 synchronized void  printTable(int n)
 {
  System.out.println(n*i);
  try
 {
  Thread.sleep(400);
 }
 catch(Exception e)
 {
	 System.out.println(e);
 }
 }
}
}
class MyThread1 extends Thread 
{
	Table t;
	MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.print table(5);
	}
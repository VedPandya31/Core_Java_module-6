package com.Module1;

class MyThread extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try 
            {
                Thread.sleep(500); // pause for 500 ms
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

public class Q31_ThreadDemo1 
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t2.start();
        t3.start();
	}
}

package com.Module1;

class Counter
{
    int count = 0;

    // synchronized method
    synchronized void increment()
    {
        count++;
    }
}

class WorkerThread extends Thread
{
    Counter c;

    WorkerThread(Counter c)
    {
        this.c = c;
    }

    public void run()
    {
        for (int i = 1; i <= 1000; i++)
        {
            c.increment();
        }
    }
}


public class Q32_ThreadDemo2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Counter c = new Counter();

        WorkerThread t1 = new WorkerThread(c);
        WorkerThread t2 = new WorkerThread(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count = " + c.count);
	}
}

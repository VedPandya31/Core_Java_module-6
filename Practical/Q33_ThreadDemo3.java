package com.Module1;

class SharedResource
{
    int data;
    boolean hasData = false;

    // Producer method
    synchronized void produce(int value)
    {
        if (hasData)
        {
            try
            {
                wait();   // wait until data is consumed
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }

        data = value;
        System.out.println("Produced: " + data);
        hasData = true;

        notify();   // notify consumer
    }

    // Consumer method
    synchronized void consume()
    {
        if (!hasData)
        {
            try
            {
                wait();   // wait until data is produced
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }

        System.out.println("Consumed: " + data);
        hasData = false;

        notifyAll();   // notify all waiting threads
    }
}

class ProducerThread extends Thread
{
    SharedResource sr;

    ProducerThread(SharedResource sr)
    {
        this.sr = sr;
    }

    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            sr.produce(i);
        }
    }
}

class ConsumerThread extends Thread
{
    SharedResource sr;

    ConsumerThread(SharedResource sr)
    {
        this.sr = sr;
    }

    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            sr.consume();
        }
    }
}


public class Q33_ThreadDemo3 
{
	public static void main(String[] args) 
	{
		SharedResource sr = new SharedResource();

        ProducerThread p = new ProducerThread(sr);
        ConsumerThread c = new ConsumerThread(sr);

        p.start();
        c.start();
	}
}

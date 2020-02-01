package com.lambton;

import java.util.Arrays;

public class MultiThreadingEg
{
    public static void main(String[] args)
    {
        DataThread t1 = new DataThread();
        //DataThread t2 = new DataThread();

        DataThreadRunnable t2 = new DataThreadRunnable();
        t1.start();
        //t2.start();
        Thread thread = new Thread(t2);
        thread.start();

        /*try{
        t1.start();
        t1.join();
        Thread thread = new Thread(t2);
        thread.start();
        thread.join();
        }
        catch(InterruptedException e)
        {
        e.printStackTrace();
        }
         */
        System.out.println("********END*******");
    }
}

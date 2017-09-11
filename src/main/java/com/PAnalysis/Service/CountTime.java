package com.PAnalysis.Service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by sickle on 17-9-7.
 */
public class CountTime implements Runnable{
    public CountTime(ArrayBlockingQueue<Long> abq) {
        this.abq = abq;
    }

    public ArrayBlockingQueue<Long> abq;

    @Autowired
    private TimeService timeService;

    @Override
    public void run() {
        try {
            for(int i=0; i<11;i++) {
                timeService.getPicture();
                TimeUnit.SECONDS.sleep(abq.take());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Time remains -----------"+""+"----------------" );
    }
}

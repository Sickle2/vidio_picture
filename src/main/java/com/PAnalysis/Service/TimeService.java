package com.PAnalysis.Service;

import com.PAnalysis.Pojo.Time;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by sickle on 17-9-7.
 */
public interface TimeService {
    public void Inform(String string);
    public void getPicture();
    public ArrayBlockingQueue<Integer> getInformTime(Time time);
}

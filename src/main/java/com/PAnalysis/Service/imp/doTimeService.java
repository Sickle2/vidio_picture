package com.PAnalysis.Service.imp;

import com.PAnalysis.Controller.PictureController;
import com.PAnalysis.Pojo.Time;
import com.PAnalysis.Service.TimeService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by sickle on 17-9-7.
 */
@Service
public class doTimeService implements TimeService {
    @Override
    public void Inform(String str) {
        getPicture();
    }

    @Override
    public void getPicture() {
    }

    @Override
    public ArrayBlockingQueue<Integer> getInformTime(Time time) {
        ArrayBlockingQueue <Integer> abq = new ArrayBlockingQueue<Integer>(12);
        try {
            int one = time.getLoad()/2;
            for(int i = 0; i < 2; i++){
                abq.put(one);
            }
            int two = time.getTeach()/5;
            for(int i = 0; i < 5; i++){
                abq.put(two);
            }
            int three = time.getLoad()/2;
            for(int i = 0; i < 2; i++){
                abq.put(three);
            }
            int four = time.getTeach()/2;
            for(int i = 0; i < 2; i++){
                abq.put(four);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return abq;
    }

}

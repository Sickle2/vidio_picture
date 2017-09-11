package com.PAnalysis.Controller;

import com.PAnalysis.Pojo.Time;
import com.PAnalysis.Service.CountTime;
import com.PAnalysis.Service.TimeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServlet;
import javax.websocket.Session;

/**
 * Created by sickle on 17-9-6.
 */
@Controller
@RequestMapping("/time")
public class TimeController{

    private static Logger logger = Logger.getLogger(TimeController.class);
    @RequestMapping(value = "/post", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public @ResponseBody
    void setTime(@RequestBody Time time) throws InterruptedException {
        logger.info("-----------------------------------"+time.toString());
        PictureController.time.setAll(time.getAll());
        PictureController.time.setHomework(time.getHomework());
        PictureController.time.setLoad(time.getLoad());
        PictureController.time.setStrengthen(time.getStrengthen());
        PictureController.time.setSummary(time.getSummary());
        PictureController.time.setTeach(time.getTeach());
    }
}

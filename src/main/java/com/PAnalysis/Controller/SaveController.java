package com.PAnalysis.Controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;

/**
 * Created by sickle on 17-9-9.
 */
@Controller
@RequestMapping("/upload")
public class SaveController {
    private static Logger logger=Logger.getLogger(SaveController.class);
    @RequestMapping("/save")
    public @ResponseBody
    void save(HttpServletRequest request) throws IOException {
        logger.info("------------------"+request+"------------------");
        //针对post请求，设置允许接收中文
        request.setCharacterEncoding("UTF-8");
        // 接收数据
        String imgStr = request.getParameter("picture");
        logger.info(imgStr);
        BASE64Decoder decoder = new BASE64Decoder();
        try
        {
            //Base64解码
            byte[] b = decoder.decodeBuffer(imgStr);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {//调整异常数据
                    b[i]+=256;
                }
            }
            //生成jpeg图片

            String imgFilePath = "/home/sickle/tu/"+new Random().nextInt()+".png";//新生成的图片
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
        }
        catch (Exception e)
        {
           logger.error("SaveController.class"+e);
        }
    }
}

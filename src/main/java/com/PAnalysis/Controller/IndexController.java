package com.PAnalysis.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Created by sickle on 17-9-7.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public ModelAndView getLoginView(ModelAndView view){
        view.setView(new RedirectView("/home.html", false));
        return view;
    }
}

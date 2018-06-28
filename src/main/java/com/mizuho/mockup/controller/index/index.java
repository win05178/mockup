package com.mizuho.mockup.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class index {

    @RequestMapping(path = "/",method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("hello","Win5555");
        return  modelAndView;

    }
}

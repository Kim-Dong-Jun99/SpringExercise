package com.goweb.springexercise.gcumvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GcuController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @PostMapping(value = "/save")
    public ModelAndView save(@ModelAttribute Car car) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("car-data");
        modelAndView.addObject("car", car);
        return modelAndView;
    }
}

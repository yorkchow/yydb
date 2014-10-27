package com.yydb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Function details
 *
 * @author: York Chow<york.chow@actionsky.com>
 * @since: 2014/10/27
 * Time: 0:27
 */
@Controller
@RequestMapping("/")
public class DefaultController {
    @RequestMapping(value = "/getDefault.do", method = RequestMethod.GET)
    public ModelAndView getDefault() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "你好，Hello World!");
        mv.setViewName("default");
        return mv;
    }
}

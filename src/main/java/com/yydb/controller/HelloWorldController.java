package com.yydb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Function details
 *
 * @author: York Chow<york.chow@actionsky.com>
 * @since: 2014/10/27
 * Time: 11:14
 */
@Controller
public class HelloWorldController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        logger.debug("Method hello");
        return "hello";
    }

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloWorld() {
        logger.debug("Method helloWorld");
        return "helloworld";
    }

    @RequestMapping(value = "/hello-redirect", method = RequestMethod.GET)
    public String helloRedirect() {
        logger.debug("Method helloRedirect");
        return "redirect:/helloworld";
    }
}

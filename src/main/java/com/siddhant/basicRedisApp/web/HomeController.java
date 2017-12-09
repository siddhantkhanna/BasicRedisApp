package com.siddhant.basicRedisApp.web;

import com.siddhant.basicRedisApp.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
    @Autowired
    private DataService dataService;

    @RequestMapping(value = "/getData", method = RequestMethod.GET)
    public String getData(HttpServletRequest request) {
        return dataService.getData();
    }
}
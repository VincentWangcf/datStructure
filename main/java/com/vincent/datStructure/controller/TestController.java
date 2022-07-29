package com.vincent.datStructure.controller;


import com.vincent.datStructure.designPatterns.factory.spring.springmvc.DispatchServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    DispatchServlet dispatchServlet;

    @RequestMapping(value = "/a",method = RequestMethod.GET)
    public void test(){
        System.out.println("=="+dispatchServlet.hashCode() +"--- "+dispatchServlet.toString());
        dispatchServlet.doDispatch();
    }
}




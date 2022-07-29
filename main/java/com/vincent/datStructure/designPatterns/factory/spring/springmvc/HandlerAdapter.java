package com.vincent.datStructure.designPatterns.factory.spring.springmvc;


//定义一个适配器的接口
public interface HandlerAdapter {
    public boolean supports(Object handler);
    public void handler(Object handler);
}

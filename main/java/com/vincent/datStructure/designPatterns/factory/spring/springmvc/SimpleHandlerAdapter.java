package com.vincent.datStructure.designPatterns.factory.spring.springmvc;


import org.springframework.stereotype.Service;

@Service
public class SimpleHandlerAdapter implements HandlerAdapter
{
    @Override
    public boolean supports(Object handler) {
      return handler instanceof  SimpleController;
    }

    @Override
    public void handler(Object handler) {
        ((SimpleController)handler).doSimpleHandler();
    }
}

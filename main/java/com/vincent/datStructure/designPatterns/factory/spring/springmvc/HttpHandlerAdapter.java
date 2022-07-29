package com.vincent.datStructure.designPatterns.factory.spring.springmvc;


import org.springframework.stereotype.Service;

@Service
public class HttpHandlerAdapter implements HandlerAdapter
{
    @Override
    public boolean supports(Object handler) {
      return handler instanceof  HttpController;
    }

    @Override
    public void handler(Object handler) {
        ((HttpController)handler).doHttpHandler();
    }
}

package com.vincent.datStructure.designPatterns.factory.spring.springmvc;


import org.springframework.stereotype.Service;

@Service
public class AnnotationHandlerAdapter implements HandlerAdapter
{
    @Override
    public boolean supports(Object handler) {
      return handler instanceof  AnnotationController;
    }

    @Override
    public void handler(Object handler) {
        ((AnnotationController)handler).doAnnotationHandler();
    }
}

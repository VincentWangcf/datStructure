package com.vincent.datStructure.designPatterns.factory.spring.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@Service
public class DispatchServlet {
    public  static List<HandlerAdapter> handlerAdapters = new ArrayList<>();
//
//    public DispatchServlet() {
//        handlerAdapters.add(new AnnotationHandlerAdapter());
//        handlerAdapters.add(new HttpHandlerAdapter());


//        handlerAdapters.add(new SimpleHandlerAdapter());
//
//    }

    private    Map<String,HandlerAdapter> map;

//    public DispatchServlet(Map<String,HandlerAdapter> map) {
////        this.map =map;
////    }

//    public  static List<HandlerAdapter> handlerAdapters;
    public DispatchServlet(List<HandlerAdapter> list) {
        this.handlerAdapters =list;
    }
    public void doDispatch(){
        HttpController controller = new HttpController();
       HandlerAdapter adapter= getHandler(controller);
       adapter.handler(controller);


    }


//    public  HandlerAdapter getHandler(MvcController controller){
//        for(Map.Entry<String,HandlerAdapter> m:map.entrySet()){
//           if ( m.getValue().supports(controller)){
//               return m.getValue();
//           }
//        }
//        return null;
//    }
    public HandlerAdapter getHandler(MvcController controller) {
        for (HandlerAdapter adapter:this.handlerAdapters){
            if (adapter.supports(controller)){
                return adapter;
            }
        }
        return null;
    }

//    public static void main(String[] args) {
//        new DispatchServlet().doDispatch();
//    }
}

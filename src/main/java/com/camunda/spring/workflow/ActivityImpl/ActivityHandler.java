package com.camunda.spring.workflow.ActivityImpl;


/**
 * Date: 4/20/2023<br/>
 * Time: 1:34 PM<br/>
 */
public class ActivityHandler {

    public static void handlerService(String service){

        switch (service){
            case "1":
                System.out.println(service);
                break;
            case "2":
                System.out.println(service);
                break;
            case "3":
                System.out.println(service);
                break;
            default:
                System.out.println("No service handler");
        }
    }
}

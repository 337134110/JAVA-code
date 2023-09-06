package service;

import bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloService {

    @Autowired
    private HelloProperties helloProperties;

    public String hello(){
        return helloProperties.getPrefix() + ":::" + "Hello ____" + helloProperties.getSuffix();
    }
}
